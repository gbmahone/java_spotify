package Spotify.util;

import java.io.IOException;

public class UiUtils {
    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("");
        } catch (IOException | InterruptedException ex) {
            // Se a execução do comando falhar, imprime 100 novas linhas
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
            ex.printStackTrace();
        }
    }
}
