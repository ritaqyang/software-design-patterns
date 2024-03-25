package ca.mcgill.cs.swdesign.unittesting.flashlight;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Reflection {

    public static void main(String[] args){


        /**
         * use reflection to increment flashlight brightness
         * using incrementBrightness() which is a private method in flashlight class
         */
        try{
            Method incrementReflection = Flashlight.class.getDeclaredMethod("incrementBrightness");
            incrementReflection.setAccessible(true);
            Flashlight f = new Flashlight();
            System.out.println("current flashlight brightness is:  " + f.getBrightness());
            incrementReflection.invoke(f);
            System.out.println("current flashlight brightness is:  " + f.getBrightness());


        } catch (NoSuchMethodException| IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }

}
