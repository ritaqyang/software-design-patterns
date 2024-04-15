package ca.mcgill.cs.swdesign.composite2.deepcopy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIntroducedShow {

    private Concert JAYZ1= new Concert("Jayz", 120);
    private Concert JAYZ2= new Concert("Jayz", 120);
    private IntroducedShow intro1 = new IntroducedShow("Beyonce", 10, JAYZ1);


    @Test
    public void testEquals_sameShowDifferentObject(){
        IntroducedShow intro2 = new IntroducedShow("Beyonce", 10, JAYZ1);
        assertEquals(JAYZ1, JAYZ2);
        System.out.println(JAYZ1.hashCode() + " " + JAYZ2.hashCode());
        assertEquals(intro1, intro2);
        assertNotSame(intro1, intro2);
        System.out.println(intro1.hashCode() + " " + intro2.hashCode());
        int hash1= JAYZ1.getArtistName().hashCode();
        int hash2 = JAYZ2.getArtistName().hashCode();
        System.out.println(hash1 + " " + hash2);

    }

    @Test
    public void testStringsEquals_artistFieldInConcert(){

        int hash1= JAYZ1.getArtistName().hashCode();
        int hash2 = JAYZ2.getArtistName().hashCode();
        Concert AnotherConcert = new Concert("Jayz", 110);
        int hash3 = AnotherConcert.getArtistName().hashCode();
        String s = "Jayz";
        String s2 = "Jayz";
        System.out.println(hash1 + " " + hash2 + " " + hash3 + " " + s.hashCode() + " "+ s2.hashCode());
        System.out.println(JAYZ1.hashCode() + " " + JAYZ2.hashCode() + " " + AnotherConcert.hashCode());
        assertEquals(hash1, hash2);
        System.out.println(JAYZ1.getClass() + " "+ intro1.getClass());

    }



}
