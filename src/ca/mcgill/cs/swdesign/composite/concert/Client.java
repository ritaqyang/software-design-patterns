package ca.mcgill.cs.swdesign.composite.concert;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){

        /*
        apply the Composite design pattern to provide support for a kind of show that is a
        combination of between two and five shows, inclusively. Write a client program that
        creates a show that consists of a concert followed by two movies, where the two movies are,
         together, represented by a single Show object.
         */
        Concert concert1 = new Concert("concert1", "person1",100);
        Movie movie1 = new Movie("M1", 2024, 120);
        Movie movie2 = new Movie("M2", 2023, 90);

        CompositeShow twoMovies  = new CompositeShow();
        twoMovies.addShow(movie1);
        twoMovies.addShow(movie2);

        CompositeShow wholeShow = new CompositeShow();
        wholeShow.addShow(concert1);
        wholeShow.addShow(twoMovies);
        /*
         * In client code, create a Show object that is an introduced version of the show created in Exercise 1,
         * where the second movie is also introduced (so, two speakers, one presenting the entire show,
         * and one presenting the second movie).
         */

        //wrap the second movie
        IntroducedShow introM2 = new IntroducedShow(movie2, 10, "rita");
        ArrayList<Show> list = new ArrayList<Show>();
        list.add(concert1);
        list.add(movie1);
        list.add(introM2);

        IntroducedShow exerise2 = new IntroducedShow(new CompositeShow(list), 12, "Tom");
        System.out.println(exerise2.description());





    }
}
