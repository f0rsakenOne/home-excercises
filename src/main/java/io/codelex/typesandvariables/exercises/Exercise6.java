package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many iterations the program should do : ");
        int i = input.nextInt();
        int counter = 0;
        int sum = 0;
        System.out.println("Please enter only single digits numbers : ");

        while ( true ){
            counter++;
            int x = input.nextInt();
            if (x<9){
                sum = x + sum;
            }
            else if (x>9){
                System.out.println("Sorry number is too big, the program will skip it");
                continue;
            }
            if (counter==i){
                System.out.println("The sum is : "+sum);
                break;
            }

        }


    }
}
