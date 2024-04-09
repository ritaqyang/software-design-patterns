package ca.mcgill.cs.swdesign.composite2.unpacking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeShow implements Show, Iterable<Show>{
    private List<Show> shows = new ArrayList<>();

    public CompositeShow(List<Show> shows) {
        this.shows = shows;
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        shows.forEach(s -> sb.append(s.description()));
        return sb.toString();
    }
    @Override
    public int runningTime() {
        int total = shows.stream().mapToInt(Show::runningTime).sum();
        return total;
    }

    /**
     * @return
     */
    @Override
    public Iterator<Show> iterator() {
        return shows.iterator();
    }
}
