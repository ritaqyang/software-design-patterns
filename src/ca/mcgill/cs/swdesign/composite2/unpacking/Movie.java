package ca.mcgill.cs.swdesign.composite2.unpacking;

public class Movie implements Show{

    private String movieName;
    private int movieDuration;

    public Movie(String movieName, int movieDuration) {
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    @Override
    public String description() {
        return "Movie: " + movieName;
    }
    @Override
    public int runningTime() {
        return movieDuration;
    }
}
