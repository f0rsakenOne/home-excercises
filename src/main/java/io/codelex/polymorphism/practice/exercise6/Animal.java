package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    abstract void makeSound();

    abstract void eat(Food food);
}
