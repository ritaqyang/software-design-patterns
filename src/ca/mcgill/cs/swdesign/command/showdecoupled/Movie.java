package ca.mcgill.cs.swdesign.command.showdecoupled;

import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

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

    /**
     * @return
     */
    @Override
    public Show copy() {
        return new Movie(this.title, this.runTime);
    }

    /**
     * @return
     */

    @Override
    public Iterator<Show> iterator(){
        return Collections.emptyIterator();}

    @Override
    public int hashCode() {
        return Objects.hash(title, runTime);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) { return true; }
        if (o == null ){ return false; }
        if (o.getClass() != getClass()){ return false; }
        Movie other = (Movie) o;
        return (other.title == title) && (other.runTime == runTime);
    }


}
