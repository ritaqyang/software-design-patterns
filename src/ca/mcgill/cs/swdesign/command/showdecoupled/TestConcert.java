package ca.mcgill.cs.swdesign.command.showdecoupled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test suite for concert class
 */
public class TestConcert {

    @Test
    public void testEquals_sameConcert(){
        Concert c1 = new Concert("Taylor Swift", 120);
        Concert c2 = new Concert("Taylor Swift", 120);
        assertEquals(c1, c2);
        assertNotSame(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());

    }

    @Test
    public void testEquals_notSameConcert(){
        Concert c1 = new Concert("Taylor Swift", 120);
        Concert c2 = new Concert("Taylor Swift", 12);
        assertFalse(c1.equals(c2));
        assertNotSame(c1, c2);
        assertNotSame(c1.hashCode(), c2.hashCode());

    }
}
