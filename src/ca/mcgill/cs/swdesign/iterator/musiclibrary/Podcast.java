package ca.mcgill.cs.swdesign.iterator.musiclibrary;

public class Podcast implements MusicType {

    private final String podcastName;

    public Podcast(String podcastName) {
        this.podcastName = podcastName;
    }


    //play method prints the values of each class
    public void play(){

        System.out.println("Podcast name is " + podcastName );

    };

}
