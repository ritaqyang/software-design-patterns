package ca.mcgill.cs.swdesign.unittesting.exercises;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.fail;


/**
 * Chapter5 exercise 6
 * using metaprogramming
 * verify whether it is possible to call any parameterless method of class String
 * on any empty string without an exception
 */
public class StringTest {

        public static void main(String[] args) {
            for (Method m : String.class.getDeclaredMethods()) {
                if (m.getParameterCount() == 0) {
                    try {
                        m.invoke("");
                    } catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException e) {
                       System.out.println("no we can't");
                    }
                }
            }
            System.out.println("yes we can");
        }



}
