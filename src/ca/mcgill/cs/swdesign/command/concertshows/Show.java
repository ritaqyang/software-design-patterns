package ca.mcgill.cs.swdesign.command.concertshows;

public interface Show extends Iterable<Show> {

    String description();
    int runningTime();
    Show copy();

}
