package ca.mcgill.cs.swdesign.template.concert;

import ca.mcgill.cs.swdesign.command.concertshows.Show;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CompositeShow implements ca.mcgill.cs.swdesign.command.concertshows.Show {
    private List<ca.mcgill.cs.swdesign.command.concertshows.Show> shows;

    public CompositeShow(List<ca.mcgill.cs.swdesign.command.concertshows.Show> showList) {
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
        for (ca.mcgill.cs.swdesign.command.concertshows.Show s : shows){ total += s.runningTime(); }
        return total;
    }

    /**
     * @return
     */
    @Override
    public ca.mcgill.cs.swdesign.command.concertshows.Show copy() {
        ArrayList<ca.mcgill.cs.swdesign.command.concertshows.Show> showsListCopy = new ArrayList<>();
        for (ca.mcgill.cs.swdesign.command.concertshows.Show s : shows){
            showsListCopy.add(s.copy());
        }
        return new CompositeShow(showsListCopy);
    }

    @Override
    public Iterator<ca.mcgill.cs.swdesign.command.concertshows.Show> iterator(){
        return shows.iterator();
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (Show s : shows){
            h += s.hashCode();
        }
        return h ;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        CompositeShow other = (CompositeShow) obj;
        return Objects.equals(shows,other.shows);

    }
}
