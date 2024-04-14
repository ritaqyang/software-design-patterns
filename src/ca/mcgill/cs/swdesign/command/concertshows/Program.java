package ca.mcgill.cs.swdesign.command.concertshows;

import java.util.*;

public class Program
{
    private final EnumMap<Day, Show> aShows = new EnumMap<>(Day.class);

    private static final Show NULLSHOW = createNullShow();
    private static Show createNullShow(){
        return new Show() {

            @Override public Iterator<Show> iterator() { return Collections.emptyIterator();}
            @Override public String description() { return ""; }
            @Override public int runningTime(){ return 0; }
            @Override public Show copy(){ return createNullShow();  }

            @Override
            public int hashCode() { return 0; }

            @Override
            public boolean equals(Object obj) {
               return obj != null && obj.getClass() == this.getClass();
            }
            };
        }



    public Program() {
        for (Day d : Day.values()){
            aShows.put(d, NULLSHOW);
        }
    }

    /**
     * Clear the program by removing all existing shows.
     */
    public void clear()
    {
        for (Day d : Day.values()){
            aShows.put(d, NULLSHOW);
        }
    }

    /**
     * Adds a new show to the program. Overrides any existing show
     * on that day.
     * @param pShow The show to add.
     * @param pDay The day when the show takes place.
     */
    public void add(Show pShow, Day pDay)
    {
        assert pShow != null && pDay != null;
        // TODO
        aShows.put(pDay, pShow);
    }


    /**
     * Removes a show from the program.
     * @param pDay The day when we want to zap the show.
     */
    public void remove(Day pDay)
    {
        assert pDay != null;
        // TODO
        //aShows.remove(pDay);
        aShows.put(pDay, NULLSHOW);
    }

    /**
     * @param pDay The day of the requested show.
     * @return A copy of the show on a given day.
     */
    public Show get(Day pDay)
    {
        assert pDay != null;
        return aShows.get(pDay);

    }

    /**
     * factory method for command object that executes adding commnad
     * @param s the show to add to program
     * @param d the day that the show is added to
     * @return
     */
    public Command createAddCommand(Show s,Day d) {
        return new Command() {

            @Override
            public void execute() {
                add(s,d);
            }

            @Override
            public void undo() {
                remove(d);
            }
        };
    }

    public Command createRemoveCommand(Day day ){
        return new Command() {
            Show copy = get(day);
            @Override
            public void execute() {
                remove(day);
            }

            @Override
            public void undo() {
                add(copy, day);
            }
        };
    }

    public Command createClearCommand(){
        return new Command() {
            EnumMap<Day, Show> copiedEnumMap = copyMap();
            @Override
            public void execute() {
                clear();
            }

            @Override
            public void undo() {
                aShows.putAll(copiedEnumMap);
            }
        };
    }

    private EnumMap<Day,Show> copyMap(){
        EnumMap<Day, Show> copiedEnumMap = new EnumMap<>(Day.class);
        copiedEnumMap.putAll(aShows);
        return copiedEnumMap;

    }


    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for( Day day : aShows.keySet() )
        {
            if( aShows.containsKey(day))
            {
                result.append(String.format("%9s", day.name()))
                        .append(": ").append(aShows.get(day).description()).append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(NULLSHOW.getClass());
        Show copy = NULLSHOW.copy();
        System.out.println(copy.getClass());
        System.out.println(Show.class);
        Concert c= new Concert("T", 120);
        Show c2= new Concert("t", 123);
        System.out.println(c.getClass());
        System.out.println(c2.getClass());


    }
}