package Spotify.service;

import Spotify.model.Album;
import Spotify.model.Music;
import Spotify.model.Playlist;
import Spotify.util.UiUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaylistService {

    Scanner sc;
    MusicService musicService;

    public PlaylistService(Scanner scanner) {
        this.sc = scanner;
        this.musicService = new MusicService(this.sc);
    }

    public Playlist createPlaylist(){
        UiUtils.clearScreen();
        Playlist playlist = new Playlist();
        System.out.printf("Informe o nome da Playlist: ");
        playlist.setName(sc.nextLine());
        List<Music> musicList = musicService.createMusics(playlist.getName());
        playlist.setMusicList(musicList);
        return playlist;
    }

    public List<Playlist> createPlaylists(String namePlaylist){
        List<Playlist> playlistList = new ArrayList<>();
        int opcao = 0;
        while (opcao!=2) {
            UiUtils.clearScreen();
            System.out.println("CADASTRO DE PLAYLISTS PARA " + namePlaylist.toUpperCase());
            System.out.println("1 - Adicionar playlist");
            System.out.println("2 - Sair");
            System.out.printf("Digite o numero da opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    Playlist playlist = this.createPlaylist();
                    playlistList.add(playlist);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        return playlistList;

    }

}
