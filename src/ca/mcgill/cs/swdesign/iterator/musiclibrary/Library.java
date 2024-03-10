package ca.mcgill.cs.swdesign.iterator.musiclibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//todo: library class that maintains a list of song objects, ensure only one instance of lib exists

/**todo: Implement sorting, song name ascending order, artist name descending order
 */

public class Library {

    private static Library instance;

    private static List<Song> aSongList = new ArrayList<>();


    private Library(){
    };

    public static Library getInstance(){
        if (instance == null){
            instance = new Library();
        }
        return instance;
    }

    /**todo: Implement a mechanism that ensure that when adding songs to the Library, check for an existing instance
     * against global repo with the same name and artist
     * If it exists, reuse it; otherwise, create a new one
     */

    public void addSong(Song pSong ){
        //use flyweight store to retrieve or create new Song obj
        Song s = SongFactory.getSong(pSong);
        aSongList.add(s);

    }

    public void sortSongs(Comparator<Song> c, int reverseFlag ){
        if (reverseFlag == 1){
            Collections.sort(aSongList, Collections.reverseOrder(c));
        }
        else{
            Collections.sort(aSongList,c);
        }
    }

}
