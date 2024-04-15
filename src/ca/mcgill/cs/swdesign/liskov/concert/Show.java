package ca.mcgill.cs.swdesign.liskov.concert;

public interface Show extends Iterable<Show> {

    String description();
    int runningTime();
    Show copy();

}
