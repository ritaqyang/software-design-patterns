package ca.mcgill.cs.swdesign.composite2.deepcopy;

public interface Show extends Iterable<Show> {

    String description();
    int runningTime();
    Show copy();

}
