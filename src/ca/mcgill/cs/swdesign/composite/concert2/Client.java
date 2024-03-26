package ca.mcgill.cs.swdesign.composite.concert2;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){

        Concert concert1 = new Concert("concert1", "person1",100);
        Movie movie1 = new Movie("M1", 2024, 120);
        Movie movie2 = new Movie("M2", 2023, 90);

        CompositeShow twoMovies  = new CompositeShow();
        twoMovies.addShow(movie1);
        twoMovies.addShow(movie2);

        CompositeShow wholeShow = new CompositeShow();
        wholeShow.addShow(concert1);
        wholeShow.addShow(twoMovies);

        /**
         * implementing function that allows us to unpack the items in CompositeShow
         * This interface benefits from the subtypying relationship this introduced
         * Pros: client code can be more polymorphic
         *
         * con:  an implementation of iterator() must also be supplied for classes that
         * have nothing to unpack.
         *
         * However, with Java 8 it is a relatively minor concern
         * because we can declare a default method that returns an empty iterator
         * in the Show interface
         */

        for (Show s: wholeShow){
            System.out.println(s.description());

        }








    }
}
