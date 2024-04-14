package ca.mcgill.cs.swdesign.command.showdecoupled;

import java.util.Stack;

/**
 * Chapter6 Exercise 17
 * Abstraction that allows clients to
 * execute commands
 * store executed commands
 * and undo the last executed command
 * Ensure your design respects the Law of Demeter
 *
 * Chapter 6 Exercise 18
 * Extend the command processor s.t. it supports re-doing commands
 * execute undone commands
 *
 * Chapter 6 Exercise 19
 * Modify your design so that operations of command processing is encapsulated within program class
 * client can add, remove, clear on instance of program
 * and be able to undoLast()
 * Avoid pushing Program to a god class and decouple program from command processing
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
