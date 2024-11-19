package Spotify.service;

import Spotify.model.Music;
import Spotify.util.UiUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicService {

    Scanner sc;

    public MusicService(Scanner scanner){
        this.sc = scanner;
    }

    public Music createMusic(String musicToName){
        UiUtils.clearScreen();
        Music music = new Music();
        System.out.println("ADICIONAR MUSICA PARA " + musicToName.toUpperCase());
        System.out.printf("Informe o nome da musica: ");
        String name = sc.nextLine();
        music.setName(name);
        System.out.println("Essa música para maiores de 18 anos?(s/n) ");
        String control = sc.nextLine();
        if (control.toLowerCase() == "s"){
            music.setParentalControl(true);
        } else {
            music.setParentalControl(false);
        }

        return music;
    }

    public List<Music> createMusics(String albumName){
        List<Music> musicList = new ArrayList<>();
        int opcao = 0;
        while (opcao!=2) {
            UiUtils.clearScreen();
            System.out.println("CADASTRO DE MUSICAS PARA O ALBUM " + albumName.toUpperCase());
            System.out.println("1 - Adicionar musica");
            System.out.println("2 - Sair");
            System.out.printf("Digite o numero da opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    Music music = this.createMusic(albumName);
                    musicList.add(music);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        return musicList;
    }
}


