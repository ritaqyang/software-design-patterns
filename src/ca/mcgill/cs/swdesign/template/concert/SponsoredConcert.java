package ca.mcgill.cs.swdesign.template.concert;

public class SponsoredConcert extends Concert{
    private String aSponsor;

    public SponsoredConcert(String pTitle, int pTime, String aPerformer) {
        super(pTitle, pTime, aPerformer);
    }

    @Override
    public String extra(){
        return super.extra() + " Sponsored by " + aSponsor;
    }
}
