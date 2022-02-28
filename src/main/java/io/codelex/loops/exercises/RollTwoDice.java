package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Desired sum: ");
        int desiredNum = in.nextInt();
        int sum = 0;
        if (desiredNum>0&&desiredNum<=12){
            while ( sum!=desiredNum ){
                int x = 1+random.nextInt(6);
                int y = 1+random.nextInt(6);
                sum= x+y;
                System.out.printf("%d and %d = %d %n",x,y,sum);
            }
        } else System.out.println("Sorry but the number should be between 1 and 12.");


    }
}
