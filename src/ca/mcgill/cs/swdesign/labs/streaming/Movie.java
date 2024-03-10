package ca.mcgill.cs.swdesign.labs.streaming;

public class Movie implements Entertainment{

    private final String aDirector;
    private final Genre aGenre;

    private final int aRuntime;


    public Movie(String pDirector,int pRuntime, Genre pGenre) {

        assert pDirector != null && pGenre != null  && pRuntime > 0 ;
        aDirector = pDirector;
        aGenre = pGenre;
        aRuntime = pRuntime;
    }

    public String getDirector(){ return aDirector;  }
    public Genre getGenre() { return aGenre;}

    public int getRuntime() { return aRuntime; }


}
