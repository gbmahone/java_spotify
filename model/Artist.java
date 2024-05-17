package Spotify.model;

import java.util.List;

public class Artist {
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
}
