package ca.mcgill.cs.swdesign.composite2.unpacking2;

import lombok.Builder;

import java.util.Collections;
import java.util.Iterator;

public class Concert implements Show {
    private String artistName;
    private int concertDuration;

    public Concert(String artistName, int concertDuration) {
        this.artistName = artistName;
        this.concertDuration = concertDuration;
    }

    @Override
    public String description() {
        return "Concert by artist : " + artistName;
    }

    @Override
    public int runningTime() {
        return concertDuration;
    }
    @Override
    public Iterator<Show> iterator(){
        return Collections.emptyIterator();
    }
}
