package dev.thingy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    private static final Scanner sc = new Scanner(System.in);

    private static final String ANSI_RESET = "\u001B[0m";

    private static final String ANSI_BLACK = "\u001B[30m";

    private static final String ANSI_WHITE_BACKGROUND= "\u001B[47m";
    private static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        playTheGame();
    }

    private static void playTheGame() {
        String word = wordPicker();
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (char c : letters) {
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + c + ANSI_RESET + " ");
            }
            System.out.println();
        }
    }

    private static String wordPicker() {
        List<String> array = new ArrayList<>(List.of(
                "DRIVE", "GLIDE", "SMITE", "LARGE" //Obviously will be changed
        ));
        Random random = new Random();
        int rand = random.nextInt(array.size());

        return array.get(rand);
    }


}
