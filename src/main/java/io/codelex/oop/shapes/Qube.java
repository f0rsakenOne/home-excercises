package io.codelex.oop.shapes;

public class Qube extends Shape3D {
    private double sideLength;

    public Qube(int numSides, double sideLength) {
        super(numSides);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter() {
        return 12 * sideLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}
