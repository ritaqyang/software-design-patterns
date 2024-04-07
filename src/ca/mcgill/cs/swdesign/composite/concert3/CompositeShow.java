package ca.mcgill.cs.swdesign.composite.concert3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Composite class for shows, 2-5 shows, inclusive
 * Using design for contract
 */
public class CompositeShow implements Show {

    public List<Show> aElements = new ArrayList<>();

    /**
     * adds show to the CompositeShow object's aElements field
     * @param s the show that we want to add to the composite object
     */
    public void addShow(Show s){
        aElements.add(s);
    }

    public CompositeShow(List<Show> pElements){
        aElements = pElements;
    }
    public CompositeShow(){
    }


    /**
     * @return A description of all the shows in aElements field
     */
    public String description(){
        String result = "";
        for (Show e : aElements){
            result += e.description();
            result += " ";
        }
        return result;
    }


    /**
     * @return The running time of all shows in aElements, in minutes.
     */
    public int runningTime(){
        Integer result = 0 ;
        for (Show e : aElements){
            result += e.runningTime();
        }
        return result;
    };

    /**
     *
     * @return A copy of a list of all the shows in aElements
     */
    @Override
    public Show copy(){

       List<Show> result = new ArrayList<>();
       for (Show e : aElements){
           result.add(e.copy());
       }
       return new CompositeShow(result);

    };

    /**
     * @return
     */
    @Override
    public Iterator<Show> iterator() {
        return aElements.iterator();
    }

    /**
     * override equals() method
     * if the shows in composite is the same and in the same order
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeShow shows = (CompositeShow) o;
        return aElements.equals(shows.aElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aElements);
    }
}
