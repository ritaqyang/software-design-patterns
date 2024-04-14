package ca.mcgill.cs.swdesign.command.showdecoupled;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;

/**
 * Chapter 6 Exercise 19
 *  * Modify your design so that operations of command processing is encapsulated within program class
 *  * client can add, remove, clear on instance of program
 *  * and be able to undoLast()
 *  * Avoid pushing Program to a god class and decouple program from command processing
 *
 *
 *  Steps:
 *  command factory methods made private
 *  program's methods create command objects and ask processor to execute
 */
public class Program
{
    private final EnumMap<Day, Show> aShows = new EnumMap<>(Day.class);
    private final CommandProcessor cp = new CommandProcessor();

    public void undoLast(){
        cp.undoLast();
    }

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

    public void clear()
    {
        cp.executeCommand(createClearCommand());
    }
    public void add(Show pShow, Day pDay)
    {
        assert pShow != null && pDay != null;
        cp.executeCommand(createAddCommand(pShow,pDay));
    }
    public void remove(Day pDay)
    {
        assert pDay != null;
        cp.executeCommand(createRemoveCommand(pDay));
    }

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
    private Command createAddCommand(Show s, Day d) {
        return new Command() {

            @Override
            public void execute() {
                aShows.put(d, s);
            }

            @Override
            public void undo() {

                aShows.put(d, NULLSHOW);

            }
        };
    }

    private Command createRemoveCommand(Day day ){
        return new Command() {

            Show copy = aShows.get(day);
            @Override
            public void execute() {
                aShows.put(day, NULLSHOW);
            }

            @Override
            public void undo() {
                aShows.put(day,copy);
            }
        };
    }

    private Command createClearCommand(){
        return new Command() {
            EnumMap<Day, Show> copiedEnumMap = copyMap();
            @Override
            public void execute() {

                for(Day d: aShows.keySet()){
                    aShows.put(d,NULLSHOW);

                }
            }
            @Override
            public void undo() {
                aShows.putAll(copiedEnumMap);
            }
        };
    }

    private EnumMap<Day, Show> copyMap(){
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