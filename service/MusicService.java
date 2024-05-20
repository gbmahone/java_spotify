package Spotify.service;

import Spotify.model.Music;

import java.util.Scanner;

public class MusicService {

    Scanner sc = new Scanner(System.in);

    public Music createMusic(){
        Music music = new Music();
        System.out.println("Informe o nome da musica: ");
        music.setName(sc.nextLine());
        System.out.println("Informe a duração em minutos: ");
        music.setDuration(sc.nextInt());
        return music;
    }
}
