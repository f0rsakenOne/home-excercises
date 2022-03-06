package io.codelex.loops.exercises;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Min? ");
        int min = in.nextInt();
        System.out.print("Max? ");
        int max = in.nextInt();
        System.out.println(createNumberSquare(min,max));
    }
    private static String createNumberSquare(int min, int max){
        StringBuilder numSquare = new StringBuilder();
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                numSquare.append(i);
                if (i == max) {
                    i = min;
                } else {
                    i++;
                }
            }
            numSquare.append("\n");
        }
        return numSquare.toString();
    }

}
