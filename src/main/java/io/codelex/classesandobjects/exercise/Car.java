package io.codelex.classesandobjects.exercise;

public class Car {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car( double startOdo){
        this.startKilometers = startOdo;
    }
    double calculateConsumption(){
        return (endKilometers-startKilometers)/liters;
    }
    boolean gasHog(){
        return (100/calculateConsumption()) > 15;
    }
    boolean economyCar(){
        return (100/calculateConsumption())<5;
    }
    void fillUp( double mileage, double liters ){
        this.endKilometers = mileage;
        this.liters = liters;
    }

}
