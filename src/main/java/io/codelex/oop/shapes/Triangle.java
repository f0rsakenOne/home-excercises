package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private double width;
    private double height = (width * Math.sqrt(3)) / 2;

    public Triangle(int numSides, int width) {
        super(numSides);
        this.width = width;
    }

    @Override
    public double getArea() {
        return (Math.pow(width, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double getPerimeter() {
        return width * 3;
    }
}
