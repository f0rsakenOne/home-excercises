package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle abcd = new Rectangle(4, 4, 5);
        System.out.println("Rectangle has " + abcd.getNumSides() + " sides.");
        System.out.println("Rectangle perimeter : " + abcd.getPerimeter());
        System.out.println("Rectangle area : " + abcd.getArea());

        Triangle xyz = new Triangle(3, 5);
        System.out.println("Triangle has " + xyz.getNumSides() + " sides.");
        System.out.println("Triangle perimeter : " + xyz.getPerimeter());
        System.out.println("Triangle area : " + xyz.getArea());
    }
}
