package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        int secretNum =(int) Math.round(1+(Math.random()*100)) ;
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int num = input.nextInt();
        if (num>secretNum){
            System.out.printf("Sorry, you are too high. I was thinking of %d%n",secretNum);
        } else if (num<secretNum){
            System.out.printf("Sorry, you are too low. I was thinking of %d%n",secretNum);
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }

    }
}
