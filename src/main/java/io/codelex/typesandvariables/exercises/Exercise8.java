package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes : ");
        long minutes = input.nextLong();
        long year = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long day = remainingMinutes / 1440;
        System.out.printf("%d is %d years and %d days.%n",minutes,year,day);
    }
}
