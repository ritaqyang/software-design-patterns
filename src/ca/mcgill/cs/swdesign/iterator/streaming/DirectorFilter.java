package ca.mcgill.cs.swdesign.iterator.streaming;

public class DirectorFilter implements Filter {

    public boolean filter(String searchString, Entertainment e){
        if (e.getDirector() == searchString){
            return true;
        }

        return false;

    }
}
