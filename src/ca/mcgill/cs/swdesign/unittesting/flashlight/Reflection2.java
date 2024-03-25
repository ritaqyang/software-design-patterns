package ca.mcgill.cs.swdesign.unittesting.flashlight;
import java.lang.reflect.Field;

public class Reflection2 {
    /**
     * this is an example of using reflection to change the value of private field
     */
    public static void main(String[] args) {

        try {
            Flashlight f = new Flashlight();
            Field rBrightness = Flashlight.class.getDeclaredField("brightness");
            rBrightness.setAccessible(true);
            rBrightness.set(f,3);
            System.out.println("current flashlight brightness is: " + f.getBrightness());

        } catch (NoSuchFieldException e) {
            e.getStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
