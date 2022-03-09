package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        double energyDrinkers = NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS;
        double preferCitrus = energyDrinkers * PREFER_CITRUS_DRINKS;
        System.out.printf("Total number of people surveyed %d%n", NUMBERED_SURVEYED);
        System.out.printf("Approximately %.0f bought at least one energy drink%n", energyDrinkers);
        System.out.printf("%.0f of those prefer citrus flavored energy drinks.", preferCitrus);
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        throw new NoCodeWrittenException();
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        throw new NoCodeWrittenException();
    }
}
