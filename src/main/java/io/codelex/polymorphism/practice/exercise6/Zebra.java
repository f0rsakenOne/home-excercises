package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Zebra extends Mammal {
    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("//zebra noise");
    }

    @Override
    void eat(Food food, int count) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + count);
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return getAnimalType() + "["
                + getAnimalName() + ","
                + format.format(getAnimalWeight()) + ","
                + getLivingRegion() + ","
                + getFoodEaten() + "] ";
    }
}
