package ca.mcgill.cs.swdesign.command.concertshows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestCommand {
    private Program p = new Program();
    private Concert ERAS = new Concert("Taylor Swift", 180);


    @Test
    public void testUndo_addCommand(){
        Command addEras = p.createAddCommand(ERAS, Day.FRIDAY);
        addEras.execute();
        assertEquals(ERAS, p.get(Day.FRIDAY));
        addEras.undo();
        assertNotEquals(ERAS, p.get(Day.FRIDAY));
        assertEquals(0, p.get(Day.FRIDAY).hashCode());

    }

    @Test
    public void testUndo_clearCommand(){
        for (Day d: Day.values()){
            p.add(ERAS, d);
        }

        Command clearEras = p.createClearCommand();
        assertEquals(ERAS, p.get(Day.MONDAY));
        clearEras.execute();
        assertEquals(0, p.get(Day.MONDAY).hashCode());
        clearEras.undo();
        assertEquals(ERAS, p.get(Day.MONDAY));

    }
}
