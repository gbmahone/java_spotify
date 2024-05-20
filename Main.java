package Spotify;

import Spotify.model.Album;
import Spotify.model.Artist;
import Spotify.model.Music;
import Spotify.service.ArtistService;
import Spotify.service.MusicService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String format(String name) {
       return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        List<Artist> artistList = new ArrayList<>();
        ArtistService artistService = new ArtistService();
        int opcao = 0;

        Scanner sc = new Scanner(System.in);
        while(opcao != 5) {
            System.out.println("MENU:");
            System.out.println("01 - Cadastrar Artista");
            System.out.println("02 - Criar playlis");
            System.out.println("03 - Tocar Musica");
            System.out.println("04 - Tocar Album");
            System.out.println("05 - Sair");
            System.out.printf("Digite o numero da opção desejada: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opção 01");
                    Artist artist = artistService.createArtist();
                    artistList.add(artist);
                    break;
                case 2:
                    System.out.println("Opção 02");
                    break;
                case 3:
                    System.out.println("Opção 03");
                    break;
                case 4:
                    System.out.println("Opção 04");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
