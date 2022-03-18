package io.codelex.classesandobjects.exercise;

public class Car {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings
    private final double gasHogConsumption = 15d;
    private final double economyConsumption = 5d;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    double calculateConsumption() {
        return (endKilometers - startKilometers) / liters;
    }

    boolean gasHog() {
        return (100 / calculateConsumption()) > gasHogConsumption;
    }

    boolean economyCar() {
        return (100 / calculateConsumption()) < economyConsumption;
    }

    void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
