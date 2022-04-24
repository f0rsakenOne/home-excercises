package io.codelex.oop.shapes;

public class Cone extends Shape3D {
    private double height;
    private double radius;

    public Cone(int numSides, double height, double radius) {
        super(numSides);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }

    @Override
    public double getPerimeter() {
        return radius * Math.PI + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)) * 2;
    }

    @Override
    public double getVolume() {
        return (1f / 3f) * Math.PI * Math.pow(radius, 2) * height;
    }
}
