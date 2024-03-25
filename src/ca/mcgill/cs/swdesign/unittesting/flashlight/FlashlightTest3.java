package ca.mcgill.cs.swdesign.unittesting.flashlight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * this tests private method incrementBrightness();
 */
public class FlashlightTest3 {
    Flashlight f;
    @BeforeEach
    void setup(){
        this.f = new Flashlight();
    }

    @Test
    void testPrivateIncrementBrightness(){
        try {
            //create reflection
            Method rIncrement = Flashlight.class.getDeclaredMethod("incrementBrightness");
            rIncrement.setAccessible(true);

            //action
            rIncrement.invoke(f);
            assertEquals(1, f.getBrightness());


        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void testDefaultBrightness(){
        assertEquals(0, f.getBrightness());
    }

    @Test
    void testValidBrightness(){
        f.setBrightness(3);
        assertEquals(3,f.getBrightness());
    }

}
