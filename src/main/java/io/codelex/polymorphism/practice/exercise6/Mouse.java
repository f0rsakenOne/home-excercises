package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    @Override
    void makeSound() {
        System.out.println("Pipipi");
    }

    @Override
    void eat(Food food) {

    }
}
