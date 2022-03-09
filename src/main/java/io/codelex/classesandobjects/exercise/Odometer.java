package io.codelex.classesandobjects.exercise;

public class Odometer {
    private int mileage=0;
    private final int MAX_MILEAGE = 999999;

    public int getMileage() {
        return mileage;
    }

    public void incrementOdometer(){
        if (mileage<MAX_MILEAGE){
            mileage+=1;
            if (mileage%10==0){
                FuelGauge.decrementFuel();
            }
        } else {
            mileage=0;
        }

    }
}
