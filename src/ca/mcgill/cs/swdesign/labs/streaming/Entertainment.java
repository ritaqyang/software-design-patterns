package ca.mcgill.cs.swdesign.labs.streaming;

public interface Entertainment {

    String getDirector();
    Genre getGenre();
    enum Genre {
        Thriller, Comedy, Action
    }



}
