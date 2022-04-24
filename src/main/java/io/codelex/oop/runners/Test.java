package io.codelex.oop.runners;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your time : ");
        double time = input.nextDouble();
        Runner test = Runner.getFitnesLevel(time);
        System.out.println(test);
    }
}
