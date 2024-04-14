package ca.mcgill.cs.swdesign.command.showdecoupled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestCommand {
    private Program p = new Program();
    private Concert ERAS = new Concert("Taylor Swift", 180);


    @Test
    public void testUndo_addCommand(){
        p.add(ERAS, Day.FRIDAY);
        assertEquals(ERAS, p.get(Day.FRIDAY));
        p.undoLast();
        assertNotEquals(ERAS, p.get(Day.FRIDAY));
        assertEquals(0, p.get(Day.FRIDAY).hashCode());

    }

    @Test
    public void testUndo_clearCommand(){
        for (Day d: Day.values()){
            p.add(ERAS, d);
        }
        assertEquals(ERAS, p.get(Day.MONDAY));
        p.clear();
        assertEquals(0, p.get(Day.MONDAY).hashCode());
        p.undoLast();
        assertEquals(ERAS, p.get(Day.MONDAY));

    }
}
