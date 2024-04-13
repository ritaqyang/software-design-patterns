package ca.mcgill.cs.swdesign.composite2.deepcopy;

import java.util.Arrays;

/**
 * Exercise 8
 * we want a way for client to unpack all show
 * this time modifying the show interface
 *
 * Exercise 11
 * add support for polymorphic copying by adding a copy() method to show interface
 *
 * Exercise 12 - implement equals and hashcode for all implementing classes of show
 *  * consider two composites equal if same shows in same sequence
 *  Exercise 13: unit test for deep copying
 *
 *  Exercise 14:
 *  Complete the class program, using null show object
 *  you should be able to use Show.copy() and Program.get() methods
 *  clients can also determine if the given show is a null show
 *
 *
 *
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
        Show combo2Copy = combo2.copy();
        for (Show s : combo2) { System.out.println(s.description()); }


    }
}
