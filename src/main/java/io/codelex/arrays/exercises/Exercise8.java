package io.codelex.arrays.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    static Random random = new Random();
    private static final String[] words = {"important","spine","departure","concrete","intermediate"};
    private static final String currentWord = words[random.nextInt(words.length)];
    private static String[] foundLetters = new String[3];

    public static void main(String[] args) {
        while ( !isWon() ) {
            displayWord();
            userInput();
        }


    }
    public static void displayWord(){
        String[] letters = currentWord.split("");
        System.out.print("Word : ");
        for (String letter : letters){
            if (isFound(letter)) {
                System.out.print(letter+" ");
            } else System.out.print("_ ");

        }
        System.out.println();
    }
    public static void userInput(){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(foundLetters));
        System.out.print("Guess : ");
        String key = keyboard.nextLine();
        arrayList.add(key);
        foundLetters = arrayList.toArray(foundLetters);
    }

    public static boolean isFound(String input){
        return false;
    }

    public static boolean isWon(){
        return false;
    }

}
