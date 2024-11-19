package Spotify.service;

import Spotify.model.Album;
import Spotify.model.Artist;
import Spotify.util.UiUtils;

import java.util.List;
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
        //uma lista de albuns é criada pelo albumService e atribuido o retorno a variável artistAlbums
        List<Album> artistAlbums = albumService.createAlbums(artist.getName());
        //depois essa lista (artistAlbums) é adicionada ao artista pelo método setAlbumList
        artist.setAlbumList(artistAlbums);
        return artist;
    }

}
