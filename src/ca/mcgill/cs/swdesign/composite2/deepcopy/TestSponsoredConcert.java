package ca.mcgill.cs.swdesign.composite2.deepcopy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSponsoredConcert {
    private Concert jz = new Concert("Jayz", 120);
    private Concert sp = new SponsoredConcert("Jayz", 120, "Budlight");

    /**
     * Todo later: why does it work even without overriding equals / hashcode ??
     */
    @Test
    public void testEquality_sameSuperClass(){
        assertEquals(sp, jz);
    }
    @Test
    public void testEquality_superBeforeChild(){
        assertEquals(jz, sp);
    }
}
