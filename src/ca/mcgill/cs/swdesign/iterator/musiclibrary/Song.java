package ca.mcgill.cs.swdesign.iterator.musiclibrary;

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
}
