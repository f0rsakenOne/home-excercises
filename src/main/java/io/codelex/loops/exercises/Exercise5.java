package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = in.nextLine();
        System.out.print("Enter second word: ");
        String str2 = in.nextLine();

        int str1Length = str1.length();
        int str2Length = str2.length();
        int dotsNeeded = 30 - (str1Length + str2Length);

        System.out.print(str1);
        for (int i = 0; i < dotsNeeded; i++){
            System.out.print(".");
        }
        System.out.print(str2);
       // System.out.println(str1+ ".".repeat(dotsNeeded) +str2);  tas pats, bet bez for cikla
    }
}
