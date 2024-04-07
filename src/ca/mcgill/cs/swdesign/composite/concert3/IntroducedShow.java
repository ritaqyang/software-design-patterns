package ca.mcgill.cs.swdesign.composite.concert3;

import java.util.Objects;

/**
 *
 * In client code, create a Show object that is an introduced version of the show created in Exercise 1,
 * where the second movie is also introduced (so, two speakers, one presenting the entire show,
 * and one presenting the second movie).
 */
public class IntroducedShow implements Show {

    private Show aShow;

    //speaker giving a fixed timed speech
    private int introTime;

    private String speaker;

    public IntroducedShow(Show pShow, int pIntroTime, String pSpeaker){
        aShow = pShow;
        introTime = pIntroTime;
        speaker = pSpeaker;
    }


    /**
     * @return
     */
    @Override
    public String description() {
        return " [ " + speaker + " introduces " + aShow.description() + " ] ";
    }

    /**
     * @return
     */
    @Override
    public int runningTime() {
        return aShow.runningTime()+ introTime;
    }

    /**
     * @return
     */
    @Override
    public IntroducedShow copy() {
        IntroducedShow copy = new IntroducedShow(aShow.copy(), introTime, speaker);
        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntroducedShow shows = (IntroducedShow) o;
        return introTime == shows.introTime && Objects.equals(aShow, shows.aShow) && Objects.equals(speaker, shows.speaker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aShow, introTime, speaker);
    }
}
