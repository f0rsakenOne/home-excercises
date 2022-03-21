package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle abcd = new Rectangle(4, 4, 5);
        System.out.println("Rectangle has " + abcd.getNumSides() + " sides.");
        System.out.println("Rectangle perimeter : " + abcd.getPerimeter());
        System.out.println("Rectangle area : " + abcd.getArea());

        Triangle xyz = new Triangle(3, 5, 8);
        System.out.println("Triangle has " + xyz.getNumSides() + " sides.");
        System.out.println("Triangle perimeter : " + xyz.getPerimeter());
        System.out.println("Triangle area : " + xyz.getArea());

        Hexagon qwerty = new Hexagon(6, 6);
        System.out.println("Hexagon has " + qwerty.getNumSides() + " sides.");
        System.out.println("Hexagon perimeter : " + qwerty.getPerimeter());
        System.out.println("Hexagon area : " + qwerty.getArea());

        Qube minecraft = new Qube(6, 6);
        System.out.println("Cube perimeter : " + minecraft.getPerimeter());
        System.out.println("Cube surface area : " + minecraft.getArea());
        System.out.println("Cube volume : " + minecraft.getVolume());

        Cone cone = new Cone(3, 5, 6);
        System.out.println("Cone perimeter : " + cone.getPerimeter());
        System.out.println("Cone surface area : " + cone.getArea());
        System.out.println("Cone volume : " + cone.getVolume());
    }
}
