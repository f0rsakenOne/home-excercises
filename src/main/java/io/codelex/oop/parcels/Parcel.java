package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private static final int MAX_LENGTH = 300;
    private static final int MIN_LENGTH = 30;
    private static final float MIN_WEIGHT = 30.0f;
    private static final float MIN_EXPRESS_WEIGHT = 15.0f;
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength > MAX_LENGTH || xLength < MIN_LENGTH) {
            System.out.println("x length is to big/small");
            return false;
        } else if (yLength > MAX_LENGTH || yLength < MIN_LENGTH) {
            System.out.println("y length is to big/small");
            return false;
        } else if (zLength > MAX_LENGTH || zLength < MIN_LENGTH) {
            System.out.println("z length is to big/small");
            return false;
        } else if (!isExpress && weight < MIN_WEIGHT) {
            System.out.println("weight is too small");
            return false;
        } else if (isExpress && weight < MIN_EXPRESS_WEIGHT) {
            System.out.println("weight is too small for express");
            return false;
        }
        return true;
    }
}
