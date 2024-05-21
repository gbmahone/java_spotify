package Spotify.service;

import Spotify.model.Music;

import java.util.ArrayList;
import java.util.List;
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

    public List<Music> createMusics(){
        List<Music> musicList = new ArrayList<>();
        int opcao = 0;
        while (opcao!=2) {
            System.out.println("CADASTRO DE MUSICAS");
            System.out.println("1 - Adicionar musica");
            System.out.println("2 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    Music music = this.createMusic();
                    musicList.add(music);
                    break;
                case 2:
                    return musicList;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        return musicList;
    }
}


