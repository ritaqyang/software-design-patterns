package ca.mcgill.cs.swdesign.composite2.unpacking2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CompositeShow implements Show{
    private List<Show> shows;

    public CompositeShow(List<Show> showList) {
        shows = showList;
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        shows.forEach(s ->sb.append(s.description()));
        return sb.toString();

    }

    @Override
    public int runningTime() {
        int total = 0;
        for (Show s : shows){ total += s.runningTime(); }
        return total;
    }
    @Override
    public Iterator<Show> iterator(){
        return shows.iterator();
    }
}
