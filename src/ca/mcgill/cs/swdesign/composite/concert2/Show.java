package ca.mcgill.cs.swdesign.composite.concert2;

import java.util.Collections;
import java.util.Iterator;

/**
 * implementing function that allows us to unpack the items in CompositeShow
 * This interface benefits from the subtypying relationship this introduced
 * Pros: client code can be more polymorphic
 * con:  an implementation of iterator() must also be supplied for classes that
 * have nothing to unpack. However, with Java 8 it is a relatively minor concern
 * because we can declare a default method that returns an empty iterator
 * in the Show interface
 */
public interface Show extends Iterable<Show>{

    /**
     * @return A description of the show.
     */
    String description();


    /**
     * @return The running time of the show, in minutes.
     */
    int runningTime();

    Show copy();
    @Override
    default Iterator<Show> iterator()
    {
        return Collections.emptyIterator();
    }

}
