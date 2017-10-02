package musicLibrary;

import java.io.Serializable;

public class Song implements Serializable {

    private String name;
    private String artist;
    private String album;

    public Song(String artist, String album, String name) {
        this.artist = artist;
        this.album = album;
        this.name = name;
    }

    public Song(String name) {
        this.name = name;
    }

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String toString() {
        return "Title:" + name + " Artist:" + artist + " Album:" + album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
