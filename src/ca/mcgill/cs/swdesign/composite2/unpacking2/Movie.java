package ca.mcgill.cs.swdesign.composite2.unpacking2;

import java.util.Collections;
import java.util.Iterator;

public class Movie implements Show {

    private String title;
    private int runTime;

    public Movie(String title, int runTime) {
        this.title = title;
        this.runTime = runTime;
    }

    @Override
    public String description() {
        return "Movie: " + title;
    }
    @Override
    public int runningTime() {
        return runTime;
    }
    @Override
    public Iterator<Show> iterator(){
        return Collections.emptyIterator();
    }
}
