package ca.mcgill.cs.swdesign.composite.concert3;

import java.util.Objects;

/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Concert implements Show
{
    private String aTitle;
    private String aPerformer;
    private int aRunningTime;

    /**
     * @param pTitle The title of the concert
     * @param pPerformer The name of the artist or orchestra performing
     * @param pTime The running time of the concert.
     */
    public Concert(String pTitle, String pPerformer, int pTime)
    {
        aTitle = pTitle;
        aPerformer = pPerformer;
        aRunningTime = pTime;
    }


    /**
     * copy constructor for concert
     * @param pConcert
     * @return a copy of pConcert
     */

    public Concert(Concert pConcert)
    {
        this(pConcert.aTitle, pConcert.aPerformer, pConcert.aRunningTime);
    }

    @Override
    public String description()
    {
        return String.format("%s by %s", aTitle, aPerformer);
    }

    @Override
    public int runningTime()
    {
        return aRunningTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert shows = (Concert) o;
        return aRunningTime == shows.aRunningTime && Objects.equals(aTitle, shows.aTitle) && Objects.equals(aPerformer, shows.aPerformer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle, aPerformer, aRunningTime);
    }

    @Override
    public Show copy()
    {
        return new Concert(this);
    }

}
