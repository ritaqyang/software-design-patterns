package ca.mcgill.cs.swdesign.iterator.musiclibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/** TODO: test flyweight functionality, when existing songs are added to the playlist, they are reused
 *
 *
 */
public class FlyweightTest {

    @Test
    public void testSongFactoryNoSizeIncrease(){
        Song s1 = new Song("Young, Dumb and Broke", "Khalid");
        Library.getInstance().addSong(s1);
        Library.getInstance().addSong(s1);
        assertEquals(1, SongFactory.playlist.size());

    }

    @Test
    public void testSongFactorySizeIncrease(){
        Song s1 = new Song("Young, Dumb and Broke", "Khalid");
        Song s2 = new Song("Good for you", "Olivia Rodrigo");

        Library.getInstance().addSong(s1);
        Library.getInstance().addSong(s2);

        assertEquals(2, SongFactory.playlist.size());

    }


}
