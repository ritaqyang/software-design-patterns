package ca.mcgill.cs.swdesign.composite2.deepcopy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestCompositeShow {
    private Concert ERAS = new Concert("Taylor Swift", 180);
    private Concert ERAS2 = new Concert("Taylor Swift", 180);
    private IntroducedShow ERASIntro = new IntroducedShow("JT", 10, ERAS);

    private Movie BARBIE = new Movie("Barbie", 120);
    private Movie SPIDERMAN = new Movie("Spiderman", 123);

    private CompositeShow combo1 = new CompositeShow(Arrays.asList(ERAS, BARBIE));
    private CompositeShow combo2 = new CompositeShow(Arrays.asList(ERAS2, BARBIE));
    private CompositeShow introCombo1 = new CompositeShow(Arrays.asList(ERASIntro, BARBIE));

    @Test
    public void testEquals_sameCombo(){
        assertEquals(combo1,combo2);
        assertNotSame(combo1,combo2);
    }

    @Test
    public void testEquals_sameCombo_DoubleLayer(){
        CompositeShow combo3 = new CompositeShow(Arrays.asList(combo1, SPIDERMAN));
        CompositeShow combo4 = new CompositeShow(Arrays.asList(combo2, SPIDERMAN));
        assertEquals(combo3,combo4);
        assertNotSame(combo3,combo4);

    }

    @Test
    public void testCopy_ComboWithIntro(){
        Show copy = introCombo1.copy();
        assertEquals(introCombo1, copy);

    }

    @Test
    public void testCopy_IntroducedShow(){
        IntroducedShow copy = (IntroducedShow) ERASIntro.copy();
        assertEquals(ERASIntro, copy);
        assertFalse(copy.equals(ERAS));
        assertEquals(getShow(copy), ERAS);
    }
    private static Show getShow(IntroducedShow pShow)
    {
        try
        {
            Field showField = IntroducedShow.class.getDeclaredField("show");
            showField.setAccessible(true);
            return (Show) showField.get(pShow);
        }
        catch( ReflectiveOperationException e )
        {
            fail();
            return null;
        }
    }
}
