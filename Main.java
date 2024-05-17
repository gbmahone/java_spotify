package Spotify;

import Spotify.model.Album;
import Spotify.model.Artist;
import Spotify.model.Music;

import java.util.Scanner;

public class Main {

    public static String format(String name) {
       return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("01 - Cadastrar Musica");
        System.out.println("02 - Cadastrar Artista");
        System.out.println("03 - Cadastrar Album");
        System.out.println("04 - Criar playlist");
        System.out.printf("Digite o numero da opção desejada: ");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Opção 01");
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
