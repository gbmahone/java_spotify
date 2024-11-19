package Spotify.model;

import java.util.List;

public class Artist {

    public Artist() {}
    private String name;

    private List<Album> albumList;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    @Override
    public String toString() {
        String artistString = "Artista: " + this.name;
        for (Album album : albumList) {
            artistString = artistString.concat("\n");
            artistString = artistString.concat("   " + album.toString());
        }
        return artistString;
    }
}
