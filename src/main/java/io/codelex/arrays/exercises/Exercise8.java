package io.codelex.arrays.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    //atvainojos par šo nekārtību
    static Random random = new Random();
    private static final String[] words = {"important", "spine", "departure", "concrete", "intermediate", "cool",
            "integrity", "money", "portrait", "tray", "point", "top"};
    private static String currentWord;
    private static char[] foundLetters;
    private static StringBuilder misses;

    public static void main(String[] args) {
        newGame();
        playGame();
    }
    
    private static void newGame() {
        currentWord = words[random.nextInt(words.length)];
        foundLetters = new char[currentWord.length()];
        misses = new StringBuilder();
        initSlashes();
    }

    private static void initSlashes() {
        Arrays.fill(foundLetters, '_');
    }

    private static void playGame() {
        while ( !checkWin() && !checkLoss() ) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            displayWord();
            displayMisses();
            guess();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        displayWord();
        displayMisses();
        if (checkWin()) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("You lost :(");
        }
        playAgain();
    }

    private static boolean checkWin() {
        return currentWord.equals(String.valueOf(foundLetters));
    }

    private static boolean checkLoss() {
        return misses.length() == 3;
    }

    private static void displayWord() {
        System.out.print("Word : ");
        for (char i : foundLetters) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    private static void displayMisses() {
        System.out.println("Misses : " + misses);
    }

    private static void guess() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Guess : ");
        String letter = keyboard.next();
        if (currentWord.contains(letter)) {
            int index = currentWord.indexOf(letter);
            while ( index >= 0 ) {
                foundLetters[index] = letter.charAt(0);
                index = currentWord.indexOf(letter, index + 1);
            }
        } else {
            misses.append(letter);
        }
    }


    private static void playAgain() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Play \"again\" or \"quit\"? quit");
        if (keyboard.next().equalsIgnoreCase("again")) {
            newGame();
            playGame();
        }
    }
}
