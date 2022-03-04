package io.codelex.classesandobjects.exercise;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main( String[] args )  {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter reading at the gas station: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters pumped: " );
        liters  = scan.nextDouble();

        Car car = new Car(startKilometers);
        car.fillUp(endKilometers,liters);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
        if (car.economyCar()){
            System.out.println("This is an economy car");
        } else if (car.gasHog()){
            System.out.println("This car is a gas hog");
        }

    }
}
