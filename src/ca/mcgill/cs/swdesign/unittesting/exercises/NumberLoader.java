package ca.mcgill.cs.swdesign.unittesting.exercises;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Chapter 5 exercise 5
 * Use metaprogramming, write a program that takes 2 command line arguments
 * the short name of a subtype of Number (ex. Integer, Double) and a number literal
 * creates a new instance of that type
 */
public class NumberLoader {
    public static void main(String[] args) {
        if (args.length != 2) {
            error("Invalid number of arguements ");
        }
        try {
            Class<?> someNumClass = Class.forName("java.lang." + args[0]);
            Method getValueByClass = someNumClass.getDeclaredMethod("valueOf", String.class);
            //get "valueOf" method under Number class
            //second param of getDeclaredMethod: indicating what valueOf takes as a param
            Number value = (Number) getValueByClass.invoke(null, args[1]);
            //null indicate it is a static method instead of instance method
            //now result is cast to the given number type


//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        } catch(ReflectiveOperationException e ) { //covers the ones above
            error("invalid number type");
        } catch (NumberFormatException e){
            error("invalid string input ");
        }

    }


        private static void error (String s){
            System.out.println(s);
            System.exit(1);
        }

    }
