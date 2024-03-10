package ca.mcgill.cs.swdesign.iterator.musiclibrary;

import java.util.HashMap;
import java.util.function.Function;

public class SongFactory {

    static final HashMap<Integer, Song> playlist = new HashMap<>();
    public static Song getSong(Song s){
        Integer hash = s.getArtistName().hashCode() +s.getSongName().hashCode();
        return playlist.computeIfAbsent(hash, k -> s);
    }

    private SongFactory(){};
}
