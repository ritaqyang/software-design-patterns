package ca.mcgill.cs.swdesign.composite.concert;
import java.util.*;
public class Client {

    public static void main(String[] args){
        Concert concert1 = new Concert("concert1", "person1",100);
        Concert concert2 = new Concert("concert1", "person2", 50);
        Movie movie1 = new Movie("M1", 2024, 120);
        Movie movie2 = new Movie("M2", 2023, 90);

        CompositeShow twoMovies  = new CompositeShow();
        twoMovies.addShow(movie1);
        twoMovies.addShow(movie2);




    }
}
