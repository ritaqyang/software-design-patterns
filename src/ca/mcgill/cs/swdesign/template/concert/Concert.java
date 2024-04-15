package ca.mcgill.cs.swdesign.template.concert;

public class Concert extends AbstractShow {

    private final String aPerformer;

    public Concert(String pTitle, int pTime, String aPerformer) {
        super(pTitle,pTime);
        this.aPerformer = aPerformer;
    }

    /**
     * @return
     */
    @Override
    protected String extra() {
        return "by " + aPerformer;
    }
}
