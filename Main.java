package Spotify;

import Spotify.model.Album;
import Spotify.model.Artist;
import Spotify.model.Music;
import Spotify.service.MusicService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String format(String name) {
       return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        List<Music> musics = new ArrayList<Music>();
        MusicService musicService = new MusicService();

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("01 - Cadastrar Musica");
        System.out.println("02 - Cadastrar Artista");
        System.out.println("03 - Cadastrar Album");
        System.out.println("04 - Criar sua playlist");
        System.out.printf("Digite o numero da opção desejada: ");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Opção 01");
                Music music = musicService.createMusic();
                System.out.println("New Music: " + music.toString());
                musics.add(music);
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
            default:
                System.out.println("Opção inválida");
        }
    }
}
