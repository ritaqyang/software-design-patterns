package ca.mcgill.cs.swdesign.command.concertshows;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Chapter7 Exercise 17
 * Abstraction that allows clients to
 * execute commands
 * store executed commands
 * and undo the last executed command
 * Ensure your design respects the Law of Demeter
 *
 * Chapter 7 Exercise 18
 * Extend the command processor s.t. it supports re-doing commands
 * execute undone commands
 *
 */
public class CommandProcessor {

    Stack<Command> aExecutedCommands = new Stack<>();
    Stack<Command> undoCommands = new Stack<>();


    public void executeCommand(Command com){
        com.execute();
        aExecutedCommands.push(com);
    }
    public void undoLast(){
        assert !aExecutedCommands.isEmpty();
        Command lastCommand = aExecutedCommands.pop();
        lastCommand.undo();
        undoCommands.push(lastCommand);
    }

    public void redoLast(){
        assert !undoCommands.isEmpty();
        Command lastUndoneCommand = undoCommands.pop();
        executeCommand(lastUndoneCommand);
    }



}
