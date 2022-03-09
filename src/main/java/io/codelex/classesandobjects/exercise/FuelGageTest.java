package io.codelex.classesandobjects.exercise;

public class FuelGageTest {
    public static void main(String[] args){
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer();

        fuelGauge.incrementFuel(69);
        while ( fuelGauge.getCurrentFuel()>0 ){
            odometer.incrementOdometer();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Odometer reading : "+odometer.getMileage());
            System.out.println("Fuel gage reading : "+fuelGauge.getCurrentFuel());
        }
    }

}
