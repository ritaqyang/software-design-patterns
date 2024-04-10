package ca.mcgill.cs.swdesign.composite2.unpacking2;

import java.util.Arrays;

/**
 * Exercise 8
 * we want a way for client to unpack all show
 * this time modifying the show interface
 */
public class Client {

    public static void main(String[] args) {
        CompositeShow combo1 = new CompositeShow(Arrays.asList(
                new Movie("Title1", 100),
                new Concert("Artist1", 120)
        ));
        CompositeShow combo2 = new CompositeShow(Arrays.asList(
                combo1,
                new Movie("title2", 120)
        ));

        for (Show s : combo2) { System.out.println(s.description()); }

    }
}
