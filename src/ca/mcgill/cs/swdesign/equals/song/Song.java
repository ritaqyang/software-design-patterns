package ca.mcgill.cs.swdesign.equals.song;

import java.util.Objects;

public class Song {
    private String aTitle;
    private String aArtist;

    public Song(String pTitle, String pArtist) {
        assert pTitle != null && pArtist != null;
        aTitle = pTitle;
        aArtist = pArtist;
    }

    public String getTitle() {
        return aTitle;
    }

    public String getArtist() {
        return aArtist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return aTitle.equals(song.aTitle) &&
                aArtist.equals(song.aArtist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle, aArtist);
    }
}
