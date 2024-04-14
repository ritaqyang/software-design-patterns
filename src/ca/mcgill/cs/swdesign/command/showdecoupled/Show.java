package ca.mcgill.cs.swdesign.command.showdecoupled;

public interface Show extends Iterable<Show> {

    String description();
    int runningTime();
    Show copy();

}
