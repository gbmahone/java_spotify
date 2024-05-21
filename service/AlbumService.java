package Spotify.service;

import Spotify.model.Album;
import Spotify.util.UiUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumService {

    Scanner sc;
    MusicService musicService;

    public AlbumService(Scanner scanner) {
        this.sc = scanner;
        this.musicService = new MusicService(this.sc);
    }

    public Album createAlbum(String artistName){
        UiUtils.clearScreen();
        Album album = new Album();
        System.out.println("NOVO ALBUM PARA " + artistName.toUpperCase());
        System.out.printf("Informe o nome do Album: ");
        album.setName(sc.nextLine());
        album.setMusicList(musicService.createMusics(album.getName()));
        return album;
    }

    public List<Album> createAlbums(String artistName){
        List<Album> albumList = new ArrayList<>();
        int opcao = 0;
        while (opcao!=2) {
            UiUtils.clearScreen();
            System.out.println("CADASTRO DE ALBUNS PARA " + artistName.toUpperCase());
            System.out.println("1 - Adicionar album");
            System.out.println("2 - Sair");
            System.out.printf("Digite o numero da opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    Album album = this.createAlbum(artistName);
                    albumList.add(album);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        return albumList;

    }

}
