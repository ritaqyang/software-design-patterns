package ca.mcgill.cs.swdesign.composite2.deepcopy;

import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class Concert implements Show {
    private String artistName;
    private int concertDuration;

    public Concert(String artistName, int concertDuration) {
        this.artistName = artistName;
        this.concertDuration = concertDuration;
    }

    public String getArtistName(){return artistName; }

    @Override
    public String description() {
        return "Concert by artist : " + artistName;
    }

    @Override
    public int runningTime() {
        return concertDuration;
    }

    /**
     * @return
     */
    @Override
    public Show copy() {
        return new Concert(this.artistName,this.concertDuration);
    }

    @Override
    public Iterator<Show> iterator(){
        return Collections.emptyIterator();
    }

    @Override
    public int hashCode(){
        return Objects.hash(artistName , concertDuration);
    }
    @Override
    public boolean equals(Object o){
        if (o == this){ return true; }
        if (o == null) { return false; }
        if (o.getClass() != this.getClass()){ return false;}
        Concert other = (Concert) o;
        return (other.artistName == artistName && other.concertDuration == concertDuration);
    }
}
