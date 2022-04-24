package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
