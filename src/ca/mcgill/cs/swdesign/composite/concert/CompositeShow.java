package ca.mcgill.cs.swdesign.composite.concert;
import java.util.*;

/**
 * Composite class for shows, 2-5 shows, inclusive
 * Using design for contract
 */
public class CompositeShow implements Show{

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

}
