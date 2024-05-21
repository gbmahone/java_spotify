package Spotify.service;

import Spotify.model.Artist;
import Spotify.util.UiUtils;

import java.util.Scanner;

public class ArtistService {

    Scanner sc;
    AlbumService albumService;

    public ArtistService(Scanner scanner){
        this.sc = scanner;
        this.albumService = new AlbumService(this.sc);
    }

    public Artist createArtist() {
        UiUtils.clearScreen();
        Artist artist = new Artist();
        System.out.printf("Informe o nome do Artista: ");
        artist.setName(sc.nextLine());
        artist.setAlbumList(albumService.createAlbums(artist.getName()));
        return artist;
    }
}
