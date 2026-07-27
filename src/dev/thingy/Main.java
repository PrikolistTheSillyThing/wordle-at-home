package dev.thingy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



    }

    public static void playTheGame() {
        String word = wordPicker();
    }

    public static String wordPicker() {
        List<String> array = new ArrayList<>(List.of(
                "DRIVE", "LADDER", "FATTER", "MARGIN" //Obviously will be changed
        ));
        Random random = new Random();
        int rand = random.nextInt(array.size());

        return array.get(rand);
    }
}
