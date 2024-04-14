package ca.mcgill.cs.swdesign.command.showdecoupled;
/**
 *  ===========================Command pattern==================================
         *  create a command interface that allows clearing program, adding shows, removing shows
 *  using command objects
 **/


public interface Command {

    void execute();
    void undo();
}