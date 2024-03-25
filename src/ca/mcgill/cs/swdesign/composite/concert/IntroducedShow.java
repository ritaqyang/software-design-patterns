package ca.mcgill.cs.swdesign.composite.concert;

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
    public Show copy() {
        Show copy = new IntroducedShow(aShow.copy(), introTime, speaker);
        return copy;
    }
}
