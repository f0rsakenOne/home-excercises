package io.codelex.typesandvariables.exercises;


import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters : ");
        double meters = input.nextInt();
        double miles =  meters/1609;
        System.out.print("Input hours : ");
        double hours = input.nextInt();
        System.out.print("Input minutes : ");
        double minutes = input.nextInt();
        System.out.print("Input seconds : ");
        double   seconds = input.nextInt();
        double timeInHours = hours+(minutes/60)+(seconds/3600);
        double timeInSeconds = (hours*3600)+(minutes*60)+seconds;
        System.out.printf("Your speed in meters/second is : %.8f%n" , meters/timeInSeconds);
        System.out.printf("Your speed in km/h is : %.8f%n" , (meters/1000)/timeInHours);
        System.out.printf("Your speed in miles/h is : %.8f%n" , miles/timeInHours);
    }
}
