package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> digits = new ArrayList<Integer>();
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        int sum = 0;
        while ( true ) {
            while ( number > 0 ) {
                digits.add(number % 10);
                number /= 10;
            }
            for (int i : digits) {
                sum += i * i;
            }
            number = sum;
            digits.clear();
            if (sum == 1) {
                System.out.println("Your number is happy :)");
                break;
            } else if (sum == 4) {
                System.out.println("Your number is sad :(");
                break;
            } else {
                sum = 0;
            }
        }
    }
}
