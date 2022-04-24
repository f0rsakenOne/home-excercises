package io.codelex.exceptions;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while ( true ) {
            try {
                System.out.println("Enter the numerator");
                String numeratorStr = scanner.next();
                int numerator;
                if (numeratorStr.charAt(0) == 'q' || numeratorStr.charAt(0) == 'Q') {
                    break;
                } else {
                    numerator = Integer.parseInt(numeratorStr);
                }
                System.out.println("Enter the divisor");
                int divisor = Integer.parseInt(scanner.next());
                try {
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                } catch (ArithmeticException e) {
                    System.out.println("You can't divide " + numerator + " by 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.\n" + "Please try again.");
            }
        }


    }

}

