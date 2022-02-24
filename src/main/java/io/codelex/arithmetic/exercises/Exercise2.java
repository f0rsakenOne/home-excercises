package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        CheckOddEven(number);
        System.out.println("bye! :)");
    }
    public static void CheckOddEven(int num){
        if (num%2==0) {
            System.out.println("Is even");
        } else System.out.println("Is odd");
    }
}
