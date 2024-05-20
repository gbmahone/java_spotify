package Spotify.service;

import Spotify.model.Album;
import Spotify.model.Artist;
import Spotify.model.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtistService {

    Scanner sc = new Scanner(System.in);
    public ArtistService(){}

    public Artist createArtist(){
        Artist artist = new Artist();
        System.out.println("Informe o nome do Artista: ");
        artist.setName(sc.nextLine());

        List<Album> albuns = new ArrayList<>();
        Album album1 = new Album();
        album1.setArtist(artist);
        System.out.println("Informe o nome do primeiro Album: ");
        album1.setName(sc.nextLine());

        List<Music> musicList = new ArrayList<>();
        Music music1 = new Music();
        System.out.println("Nome da Musica: ");
        music1.setName(sc.nextLine());
        musicList.add(music1);
        int opcaoMusic = 0;

        while (opcaoMusic!=2){
            System.out.println("01 - Adicionar mais uma musica");
            System.out.println("02 - Sair");
            opcaoMusic = sc.nextInt();
        }

        album1.setMusicList(musicList);


        int opcao = 0;

        while (opcao!=2){
            System.out.println("01 - Adicionar mais um album");
            System.out.println("02 - Sair");
            opcao = sc.nextInt();
        }
        return artist;
    }

}
