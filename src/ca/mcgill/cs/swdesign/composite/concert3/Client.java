package ca.mcgill.cs.swdesign.composite.concert3;

import java.util.List;

public class Client {

    public static void main(String[] args){

        Concert concert1 = new Concert("concert1", "person1",100);
        Movie movie1 = new Movie("M1", 2024, 120);
        Movie movie2 = new Movie("M2", 2023, 90);

        DoubleBill twoMovies = new DoubleBill(movie1,movie2);

        CompositeShow newComposite = new CompositeShow(List.of(concert1,twoMovies));

        for (Show subShow: newComposite){
            System.out.println(subShow.description());
        }












    }
}
