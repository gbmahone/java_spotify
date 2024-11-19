package Spotify;

import Spotify.model.Artist;
import Spotify.model.Playlist;
import Spotify.service.ArtistService;
import Spotify.service.PlaylistService;
import Spotify.util.UiUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String format(String name) {
       return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        List<Artist> artistList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ArtistService artistService = new ArtistService(sc);
        List<Playlist> playlistList = new ArrayList<>();
        PlaylistService playlistService = new PlaylistService(sc);
        int opcao = 0;


        while(opcao != 5) {
            UiUtils.clearScreen();
            System.out.println("MENU:");
            System.out.println("01 - Cadastrar Artista");
            System.out.println("02 - Criar playlist");
            System.out.println("03 - Tocar Musica");
            System.out.println("04 - Tocar Album");
            System.out.println("05 - Tocar Playlist");
            System.out.println("06 - Exibir artistas cadastrados");
            System.out.println("07 - Sair");
            System.out.printf("Digite o numero da opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Opção 01");
                    Artist artist = artistService.createArtist();
                    artistList.add(artist);
                    break;
                case 2:
                    System.out.println("Opção 02");
                    Playlist playlist = playlistService.createPlaylist();
                    playlistList.add(playlist);
                    break;
                case 3:
                    System.out.println("Opção 03");
                    break;
                case 4:
                    System.out.println("Opção 04");
                    break;
                case 5:
                    System.out.println("Opção 05");
                    for (Playlist playlistToShow : playlistList) {
                        System.out.println(playlistToShow.toString());
                    }
                    break;
                case 6:
                    System.out.println("Opção 06");
                    for (Artist artistToShow : artistList) {
                        System.out.println(artistToShow.toString());
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
