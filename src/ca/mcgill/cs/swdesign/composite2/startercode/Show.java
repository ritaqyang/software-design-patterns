package ca.mcgill.cs.swdesign.composite2.startercode;
/**
 * Represents a performance that can take place in a theater. All implementations
 * of this interface should be immutable.
 */
public interface Show
{
    /**
     * @return A description of the show.
     */
    String description();


    /**
     * @return The running time of the show, in minutes.
     */
    int runningTime();

    Show copy();
}