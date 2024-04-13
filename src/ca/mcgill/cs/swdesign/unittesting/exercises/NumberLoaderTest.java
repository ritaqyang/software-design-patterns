package ca.mcgill.cs.swdesign.unittesting.exercises;

import org.junit.jupiter.api.Test;

import java.io.InvalidClassException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberLoaderTest {

    @Test
    public void testLoadNumber_Integer(){
        Number v = NumberLoader2.loadNumber("Integer", "10");
        assertEquals(10, v.intValue());
        assertEquals(Integer.class, v.getClass());

    }
    @Test
    public void testLoadNumber_InvalidClassName(){
        assertThrows(RuntimeException.class, ()->{
            NumberLoader2.loadNumber("Integerrrr", "10");
        });

    }
    @Test
    public void testLoadNumber_InvalidNumberString(){
        assertThrows(RuntimeException.class, ()->{
            NumberLoader2.loadNumber("Double", "10bd");
        });
    }
    @Test
    public void testLoadNumber_Double(){
        Number v = NumberLoader2.loadNumber("Double", "10.45");
        assertEquals(10.45, v.doubleValue());
        assertEquals(Double.class, v.getClass());
    }

}
