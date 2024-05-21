package Spotify.service;

import Spotify.model.Album;

import java.util.Scanner;

public class AlbumService {

    Scanner sc = new Scanner(System.in);

    public Album createAlbum(){

        Album album = new Album();
        System.out.println("Informe o nome do Album: ");
        album.setName(sc.nextLine());
        return album;
    }
}
