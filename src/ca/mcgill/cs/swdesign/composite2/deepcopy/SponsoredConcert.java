package ca.mcgill.cs.swdesign.composite2.deepcopy;

public class SponsoredConcert extends Concert{
    private String sponsorName;

    public SponsoredConcert(String artistName, int concertDuration, String sponsorName) {
        super(artistName, concertDuration);
        this.sponsorName = sponsorName;
    }
}
