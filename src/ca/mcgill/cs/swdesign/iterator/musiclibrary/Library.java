package ca.mcgill.cs.swdesign.iterator.musiclibrary;

import java.util.ArrayList;
import java.util.List;

//todo: library class that maintains a list of song objects, ensure only one instance of lib exists

/**todo: Implement a mechanism that ensure that when adding songs to the Library, check for an existing instance
 * against global repo with the same name and artist
 * If it exists, reuse it; otherwise, create a new one
 */

public class Library {

    List<Song> aSongList = new ArrayList<>();
    private static Library instance;
    //static ensures that the same instance is shared across all instances of the class

    private Library(){
        aSongList = new ArrayList<>();
    };

    public Library getInstance(){
        if (instance == null){
            instance = new Library();
        }
        return instance;
    }

}
