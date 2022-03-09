package io.codelex.classesandobjects.exercise;

import java.util.Objects;

public class Dog {
    private String name;
    private String sex;
    private String nameOfFather;
    private String nameOfMother;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String nameOfFather, String nameOfMother) {
        this.name = name;
        this.sex = sex;
        this.nameOfFather = nameOfFather;
        this.nameOfMother = nameOfMother;
    }

    public String getNameOfFather() {
        String father;
        father = Objects.requireNonNullElse(this.nameOfFather, "Unknown");
        return father;
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return Objects.equals(this.nameOfMother, otherDog.nameOfMother);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Rocky", "Lady");
        Dog rocky = new Dog("Rocky", "male", "Sam", "Molly");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male", "Sparky", "Lady");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female", "Buster", "Molly");

        System.out.println(max.toString());
        System.out.println(rocky.toString());
        System.out.println(sparky.toString());
        System.out.println(buster.toString());
        System.out.println(sam.toString());
        System.out.println(lady.toString());
        System.out.println(molly.toString());
        System.out.println(coco.toString());
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println(coco.getNameOfFather());
        System.out.println(sparky.getNameOfFather());
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println(coco.hasSameMotherAs(rocky));
    }
}
