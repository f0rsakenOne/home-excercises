package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than 7: ");
        if (in.hasNextInt()){
            int dayNumber = in.nextInt();
                switch (dayNumber) {
                    case 0 -> System.out.println(dayNumber + " is a Sunday");
                    case 1 -> System.out.println(dayNumber + " is a Monday");
                    case 2 -> System.out.println(dayNumber + " is a Tuesday");
                    case 3 -> System.out.println(dayNumber + " is a Wednesday");
                    case 4 -> System.out.println(dayNumber + " is a Thursday");
                    case 5 -> System.out.println(dayNumber + " is a Friday");
                    case 6 -> System.out.println(dayNumber + " is a Saturday");
                    default -> System.out.println("Not a valid day");
                }
        } else {
            System.out.print("The number is not an int");
        }
    }
}
