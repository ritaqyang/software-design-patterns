package ca.mcgill.cs.swdesign.labs.streaming;

public class TV implements Entertainment{

    private final String aDirector;
    private final Genre aGenre;

    private final int aNumEpisodes ;

    public TV(String pDirector, Genre pGenre, int pNumEpisodes){
        assert pDirector != null && pGenre != null && pNumEpisodes > 0;
        aDirector = pDirector;
        aGenre = pGenre;
        aNumEpisodes = pNumEpisodes;
    }


    public String getDirector(){ return aDirector;  }
    public Genre getGenre() { return aGenre;}

    public int getaNumEpisodes() { return aNumEpisodes; }

}
