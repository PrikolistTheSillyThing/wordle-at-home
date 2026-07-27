package dev.thingy;

import java.util.*;


public class Main {
    private static final Scanner sc = new Scanner(System.in);

    //ansi escape colors

    private static final String ANSI_RESET = "\u001B[0m";

    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    private static final String ANSI_WHITE_BACKGROUND= "\u001B[47m";
    private static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        playTheGame();
    }

    private static void playTheGame() {
        //Play/quit option later on maybe?
        System.out.println();
        System.out.println("Please do not select the words in terminal since the" +
                " author was lazy enough not to implement that restriction");
        System.out.println();

        String word = wordPicker();
        char[] letters = word.toCharArray();
        List<Character> lettersToGuess = new ArrayList<>();

        for (char c : letters) {
            lettersToGuess.add(c);
        }

        for (int i = 0; i < lettersToGuess.size(); i++) {
            for (int j = 0; j < lettersToGuess.size(); j++) {
                for (char c : lettersToGuess) {
                    System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + c + ANSI_RESET + " ");
                }
                System.out.println("\n");
            }

            System.out.println("Enter a word that consists of 5 letters");
            String userWord = sc.nextLine().trim().toUpperCase();
            char[] userLetters = userWord.toCharArray();

            int index = 0;

            for (char c : userLetters) {
                // TODO: Potentially move this out of the for loop and print the colored letters
            }
        }

    }

    //picks random word from the array (totally sucks right now, soon to be changed)

    private static String wordPicker() {
        List<String> array = new ArrayList<>(List.of(
                "DRIVE", "GLIDE", "SMITE", "LARGE" //Obviously will be changed
        ));
        Random random = new Random();
        int rand = random.nextInt(array.size());

        return array.get(rand);
    }

    //determines which color the letter is according to the position in the list
    //later used in the loop above

    private static Colors getColor(List<Character> list, char letter, int index) {
        if (letter == list.get(index)) {
            return Colors.GREEN;
        }

        if (list.contains(letter)) {
            return Colors.YELLOW;
        }

        return Colors.BLACK;
    }


}
