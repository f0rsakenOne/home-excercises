package io.codelex.classesandobjects.exercise;

public class FuelGauge {
    private  final int MAX_FUEL = 70;
    private static int currentFuel=0;

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void incrementFuel(int fuel) {
        if (currentFuel < MAX_FUEL) {
            currentFuel += fuel;
        } else {
            System.out.println("The fuel tank is full");
            currentFuel = 70;
        }
    }
    public static void decrementFuel() {
        if (currentFuel > 0) {
            currentFuel -= 1;
        } else {
            System.out.println("The fuel tank is empty");
        }
    }
}

