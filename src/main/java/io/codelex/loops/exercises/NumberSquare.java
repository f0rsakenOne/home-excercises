package io.codelex.loops.exercises;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Min? ");
        int min = in.nextInt();
        System.out.print("Max? ");
        int max = in.nextInt();
        for (int i = min;i<=max;i++){
            int k = i;
            for (int j = min;j<=max;j++){
                System.out.print(k);
                if (k==max){
                    k=min;
                } else  k++;
            }
            System.out.println();
        }
    }
}
