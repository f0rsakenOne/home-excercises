package io.codelex.classesandobjects.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Dog {
    private String name;
    private Gender sex;
    private String nameOfFather;
    private String nameOfMother;

    public Dog(String name, Gender sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, Gender sex, String nameOfFather, String nameOfMother) {
        this.name = name;
        this.sex = sex;
        this.nameOfFather = nameOfFather;
        this.nameOfMother = nameOfMother;
    }

    public String getNameOfFather() {
        return Objects.requireNonNullElse(this.nameOfFather, "Unknown");
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this.nameOfMother == null) {
            return false;
        } else {
            return Objects.equals(this.nameOfMother, otherDog.nameOfMother);
        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog max = new Dog("Max", Gender.MALE, "Rocky", "Lady");
        Dog rocky = new Dog("Rocky", Gender.MALE, "Sam", "Molly");
        Dog sparky = new Dog("Sparky", Gender.MALE);
        Dog buster = new Dog("Buster", Gender.MALE, "Sparky", "Lady");
        Dog sam = new Dog("Sam", Gender.MALE);
        Dog lady = new Dog("Lady", Gender.FEMALE);
        Dog molly = new Dog("Molly", Gender.FEMALE);
        Dog coco = new Dog("Coco", Gender.FEMALE, "Buster", "Molly");
        List<Dog> dogList = Arrays.asList(max, rocky, sparky, buster, sam, lady, molly, coco);
        for (Dog i : dogList) {
            System.out.println(i);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println(coco.getNameOfFather());
        System.out.println(sparky.getNameOfFather());
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println(coco.hasSameMotherAs(rocky));
        System.out.println(molly.hasSameMotherAs(sam));
    }
}
