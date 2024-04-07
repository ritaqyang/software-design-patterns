package ca.mcgill.cs.swdesign.composite.concert3;

import java.util.Objects;

/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Movie implements Show {
    private String aTitle;
    private int aYear;
    private int aRunningTime;

    /**
     * @param pTitle The title of the movie
     * @param pYear  The release year of the movie
     * @param pTime  The running time of the movie.
     */
    public Movie(String pTitle, int pYear, int pTime) {
        aTitle = pTitle;
        aYear = pYear;
        aRunningTime = pTime;
    }

    //copy constructor
    public Movie(Movie pMovie) {
        aTitle = pMovie.aTitle;
        aYear = pMovie.aYear;
        aRunningTime = pMovie.aRunningTime;
    }

    @Override
    public String description() {
        return String.format("%s (%d)", aTitle, aYear);
    }

    @Override
    public int runningTime() {
        return aRunningTime;
    }

    @Override
    public Movie copy() {
        return new Movie(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie shows = (Movie) o;
        return aYear == shows.aYear && aRunningTime == shows.aRunningTime && Objects.equals(aTitle, shows.aTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle, aYear, aRunningTime);
    }
}
