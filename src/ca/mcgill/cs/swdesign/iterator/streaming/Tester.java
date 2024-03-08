package ca.mcgill.cs.swdesign.iterator.streaming;

public class Tester {

    public static void main(String[] args) {

        StreamingPlatform Netflix = StreamingPlatform.getInstance();

        Movie Prisoners = new Movie("Denis Villeneuve", 153, Entertainment.Genre.Thriller);
        Movie MeanGirls = new Movie("Mark Waters", 97, Entertainment.Genre.Comedy);
        Movie Sicario = new Movie("Denis Villeneuve", 121, Entertainment.Genre.Action);

        Netflix.addEntertainmentToPlatform(Prisoners);
        Netflix.addEntertainmentToPlatform(MeanGirls);
        Netflix.addEntertainmentToPlatform(Sicario);


    }
}
