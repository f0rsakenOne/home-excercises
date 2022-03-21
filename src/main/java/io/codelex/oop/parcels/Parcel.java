package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int maxLength = 300;
    private final int minLength = 30;
    private final float minWeight = 30.0f;
    private final float minExpressWeight = 15.0f;
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
        if (xLength > maxLength || xLength < minLength) {
            System.out.println("x length is to big/small");
            return false;
        } else if (yLength > maxLength || yLength < minLength) {
            System.out.println("y length is to big/small");
            return false;
        } else if (zLength > maxLength || zLength < minLength) {
            System.out.println("z length is to big/small");
            return false;
        } else if (!isExpress && weight < minWeight) {
            System.out.println("weight is too small");
            return false;
        } else if (isExpress && weight < minExpressWeight) {
            System.out.println("weight is too small for express");
            return false;
        }
        return true;
    }
}
