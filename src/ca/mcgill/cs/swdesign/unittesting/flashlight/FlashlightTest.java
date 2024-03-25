package ca.mcgill.cs.swdesign.unittesting.flashlight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * test suite for Flashlight class
 * test 1: default flashlight brightness level should be 0
 * test 2: test setting valid brightness
 * test 3: test setting invalid brightness
 */
public class FlashlightTest {
    Flashlight f;
    @BeforeEach
    void setup(){
        this.f = new Flashlight();
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

    @Test
    void testInvalidBrightness(){
        try{
            f.setBrightness(-1);//invalid argument for brightness
            fail(); //it should fail -> passes the test
        }catch(IllegalArgumentException e){
            //do nothing
        }
    }



}
