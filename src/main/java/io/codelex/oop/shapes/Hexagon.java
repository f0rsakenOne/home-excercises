package io.codelex.oop.shapes;

public class Hexagon extends Shape {
    private double sideLength;

    public Hexagon(int numSides, double sideLength) {
        super(numSides);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;
    }

    @Override
    public double getPerimeter() {
        return 6 * sideLength;
    }
}
