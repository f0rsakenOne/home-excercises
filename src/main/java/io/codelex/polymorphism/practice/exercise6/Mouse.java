package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Mouse extends Mammal {
    public Mouse(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Pipipi");
    }

    @Override
    void eat(Food food, int count) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + count);
        } else {
            System.out.println("Mouses are not eating that type of food!");
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
