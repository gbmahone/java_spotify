package Spotify.model;
import java.util.List;
public class Playlist {

    private String name;

    private List<Music> musicList;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        String playlistString = "Playlist: " + this.name;
        for (Music playlist : musicList) {
            playlistString = playlistString.concat("\n");
            playlistString = playlistString.concat("   " + playlist.toString());
        }
        return playlistString;
    }

}
