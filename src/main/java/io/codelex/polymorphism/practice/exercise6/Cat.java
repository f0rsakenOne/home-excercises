package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food, int count) {
        setFoodEaten(getFoodEaten() + count);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return getAnimalType() + "["
                + getAnimalName() + ","
                + breed + ","
                + format.format(getAnimalWeight()) + ","
                + getLivingRegion() + ","
                + getFoodEaten() + "] ";
    }

}
