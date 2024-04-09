package ca.mcgill.cs.swdesign.composite2.unpacking2;

/**
 * decorator pattern
 */
public class IntroducedShow implements Show {


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
