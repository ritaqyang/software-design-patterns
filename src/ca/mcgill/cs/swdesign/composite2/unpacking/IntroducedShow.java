package ca.mcgill.cs.swdesign.composite2.unpacking;

/**
 * decorator pattern
 */
public class IntroducedShow implements Show{

    public IntroducedShow(String speaker, int introTime, Show show) {
        this.speaker = speaker;
        this.introTime = introTime;
        this.show = show;
    }

    private String speaker;
    private int introTime;
    private Show show;
    @Override
    public String description() {
        return speaker + "introduces : " + show.description();
    }
    @Override
    public int runningTime() {
        return show.runningTime() + introTime;
    }
}
