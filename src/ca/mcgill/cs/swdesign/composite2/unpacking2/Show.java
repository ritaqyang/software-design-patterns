package ca.mcgill.cs.swdesign.composite2.unpacking2;

public interface Show extends Iterable<Show> {

    String description();
    int runningTime();


}
