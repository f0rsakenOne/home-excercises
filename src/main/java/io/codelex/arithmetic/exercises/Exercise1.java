package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = input.nextInt();
        System.out.print("Enter the second number : ");
        int y = input.nextInt();
        System.out.println(check15(x,y));
    }
    public static boolean check15(int x,int y){
        return x==15||y==15||x-y==15||y-x==15;
    }
}
