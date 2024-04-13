package ca.mcgill.cs.swdesign.composite2.deepcopy;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;

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