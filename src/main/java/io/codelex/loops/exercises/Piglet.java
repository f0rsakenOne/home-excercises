package io.codelex.loops.exercises;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int score = 0;


        while (true){
            int num = 1+random.nextInt(6);
            System.out.println("You rolled a "+num);
            score += num;
            if (num==1){
                score = 0;
                System.out.println("You got "+score+" points.");
                break;
            }
            System.out.print("Roll again ? ");
            String answer = in.next();
            if (answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("no")){
                System.out.println("You got "+score+" points.");
                break;
            }
        }
    }
}
