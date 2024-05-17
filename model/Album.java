package Spotify.model;

import java.util.List;

public class Album {

    private String name;
    private Artist artist;

    private List<Music> musicList;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setArtist(Artist artist){
        this.artist = artist;
    }
    public Artist getArtist(){
        return this.artist;
    }

    public String toString(){
        return this.name + " - " + this.artist.getName();
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return this.musicList;
    }
}
