package ca.mcgill.cs.swdesign.command.concertshows;

import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/**
 * decorator pattern
 */
public class IntroducedShow implements Show {


    private String speaker;
    private int introTime;

    public IntroducedShow(String speaker, int introTime, Show show) {
        this.speaker = speaker;
        this.introTime = introTime;
        this.show = show;
    }

    private Show show;


    @Override
    public String description() {
        return speaker + "introduces : " + show.description();
    }
    @Override
    public int runningTime() {
        return show.runningTime() + introTime;
    }



    @Override
    public Show copy() {
        return new IntroducedShow(this.speaker, this.introTime, show.copy());
    }

    @Override
    public Iterator<Show> iterator(){
        return Collections.emptyIterator();
    }

    @Override
    public boolean equals(Object o){
        if (o == this){ return true; }
        if (o.getClass() != this.getClass()){ return false;}
        if (o == null) { return false; }
        IntroducedShow other = (IntroducedShow) o;
        return Objects.equals(other.show, this.show) && (other.speaker == speaker) && (other.introTime == introTime);
    }
}
