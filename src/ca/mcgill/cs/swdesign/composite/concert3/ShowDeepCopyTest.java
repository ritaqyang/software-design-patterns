package ca.mcgill.cs.swdesign.composite.concert3;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * tests exercise 2 objects - if the correct deep copy is made
 */
public class ShowDeepCopyTest {

    Concert concert1 = new Concert("concert1", "person1", 100);
    Movie movie1 = new Movie("M1", 2024, 120);
    Movie movie2 = new Movie("M2", 2023, 90);
    IntroducedShow movie2Introduced = new IntroducedShow(movie2, 10, "rita");
    //combo1: 2 movies
    CompositeShow combo1 = new CompositeShow(List.of(movie1, movie2Introduced));
    //combo2: concert + combo1
    CompositeShow combo2 = new CompositeShow(List.of(concert1, combo1));

    IntroducedShow combo2Introduced = new IntroducedShow(combo2, 15, "jack");



    /**
     * it is necessary to unpack the aggregator objects to properly test
     * unpacking composite using iterator in exercise 8
     * unpacking introduced show a little more work (the use of reflection)
     * test in isolation, use stubs for recursive structure
     */
    @Test
    void testCombo2IntroducedCopy() {

        Show combo2IntroducedCopy = combo2Introduced.copy();
        // see if not the same obj but equal
        assertNotSame(combo2Introduced, combo2IntroducedCopy);
        assertEquals(combo2Introduced, combo2IntroducedCopy);

    }
    @Test
    void testCombo2UnintroducedCopy(){
        Show combo2IntroducedCopy = combo2Introduced.copy();

        //getting inner object using reflection (private field)
        try{
            Field introducedShowField = IntroducedShow.class.getDeclaredField("aShow");
            introducedShowField.setAccessible(true);
            Show inner1 = (Show) introducedShowField.get(combo2IntroducedCopy);//getting combo2 (unwrapped)

            assertEquals(combo2,inner1);
            assertNotSame(combo2, inner1);
            assertEquals(CompositeShow.class, inner1.getClass());//check if inner1 is a combo

            /**
             * What is to be observed from this exercise is that using elaborate recursive structures
             * as input and oracle is perhaps not the best way to go about testing a recursive method.
             * Ideally, each implementation should be tested in isolation, using stubs to verify the
             * copying is deep.
             */

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Tests if concert 1 inside combo2 is a correct copy
     * combo2 = [ concert1 + combo1 ]
     */
    @Test
    void testConcertInsideCombo2(){
        Show combo2IntroducedCopy = combo2Introduced.copy();

    }

}
