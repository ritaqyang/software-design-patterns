package ca.mcgill.cs.swdesign.unittesting.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write unit test for methods push and pop of class Stack. Use a fixture that you
 * initialize before every test, and make sure your tests cover documented exceptional behavior.
 */
public class StackTest {

    private final Stack<Integer> aStack = new Stack<>();

    @Test
    void testPushToEmptyStack(){

        assertEquals(5, aStack.push(5) );
        assertEquals(5, aStack.peek());

    }

    @Test
    void testPushToNonEmptyStack(){
        aStack.push(6);
        assertEquals(5, aStack.push(5));
        assertEquals(5, aStack.peek());
    }



}
