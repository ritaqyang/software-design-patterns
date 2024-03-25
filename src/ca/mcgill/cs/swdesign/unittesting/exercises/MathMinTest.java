package ca.mcgill.cs.swdesign.unittesting.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for Math.min(int,int)
 * The function returns the smaller one of the two input params (x,y)
 * The test suite covers 3 example tests - there should be more
 *
 */
public class MathMinTest {

    @Test
    public void testEqualPositives(){
        int m = Math.min(4,4);
        assertEquals(4,m);
    }

    @Test
    public void testEqualNegatives(){
        int m = Math.min(-4,-4);
        assertEquals(-4,m);
    }

    @Test
    public void testFirstGreater(){
        int m = Math.min(5,2);
        assertEquals(2,m);
    }

}
