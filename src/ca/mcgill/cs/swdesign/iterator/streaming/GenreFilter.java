package ca.mcgill.cs.swdesign.iterator.streaming;

public class GenreFilter implements Filter {

    public boolean filter(String searchString, Entertainment e){
        if (e.getGenre() == searchString){
            return true;
        }

        return false;

    }
}
