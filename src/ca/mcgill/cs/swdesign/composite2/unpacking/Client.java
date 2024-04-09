package ca.mcgill.cs.swdesign.composite2.unpacking;

import java.util.Arrays;

/**
 * Exercise 7
 * we want a way for client to unpack all show in a way that does not change the Show interface
 * so we change the composite show interface
 */
public class Client {

    public static void main(String[] args) {
        CompositeShow twoMovies = new CompositeShow(Arrays.asList(
                new Movie("barbie", 120),
                new Movie ("The Graduate", 90)));
        //bieber introduced taylor swift concert
        CompositeShow concertAndMovie = new CompositeShow(Arrays.asList(
                new Movie("Taylor Swift Era Tour Movie", 120),
                new IntroducedShow("Justin Bieber", 10, new Concert("Taylor Swift", 135))
        ));

        System.out.println("Client can unpack any composite show but client code have to explicitly check");
        System.out.println("we achieved this via making CompositeShow implement Iterable<Show> ");
        if (concertAndMovie instanceof CompositeShow){

            for (Show s: concertAndMovie){
                System.out.println(s.description());
            }
        }



    }
}
