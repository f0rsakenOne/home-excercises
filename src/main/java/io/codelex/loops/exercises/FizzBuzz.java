package io.codelex.loops.exercises;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Max value? ");
        int i = in.nextInt();
        for (int j = 1; j <= i; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (j % 3 == 0) {
                System.out.print("Fizz ");
            } else if (j % 5 == 0) {
                System.out.print("Buzz ");
            } else System.out.print(j + " ");
            if(j%20==0){
                System.out.println();
            }
        }
    }
}
