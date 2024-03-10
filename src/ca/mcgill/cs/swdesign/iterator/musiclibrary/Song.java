package ca.mcgill.cs.swdesign.iterator.musiclibrary;

import java.util.Collections;
import java.util.Comparator;

public class Song implements MusicType{

    private final String songName;
    private final String artistName;

    public Song(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }


    //play method prints the values of each class
    public void play(){
        System.out.println("Song name is " + songName );
        System.out.println("Artist name is " + artistName );
    };

    public static Comparator<Song> createByArtistComparator(){
        return new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                assert o1 != null && o2 != null;
                return o1.artistName.compareTo(o2.artistName);
            }
        };
    }

    public static Comparator<Song> createBySongComparator(){
        return new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                assert o1 != null && o2 != null;
                return o1.songName.compareTo(o2.songName);
            }
        };
    }

    public String getSongName(){return songName; }

    public String getArtistName() {
        return artistName;
    }
}
