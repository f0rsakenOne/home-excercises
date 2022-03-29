package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();
        while ( true ) {
            String animalType = scanner.next();
            if (animalType.equalsIgnoreCase("end")) {
                break;
            }
            String animalName = scanner.next();
            double animalWeight = scanner.nextDouble();
            String livingRegion = scanner.next();
            String breed = scanner.nextLine();


            Animal animal = switch (animalType) {
                case "Cat" -> new Cat(animalType, animalName, animalWeight, livingRegion, breed);
                case "Tiger" -> new Tiger(animalType, animalName, animalWeight, livingRegion);
                case "Mouse" -> new Mouse(animalType, animalName, animalWeight, livingRegion);
                case "Zebra" -> new Zebra(animalType, animalName, animalWeight, livingRegion);
                default -> null;
            };
            try {
                animal.makeSound();
            } catch (NullPointerException e) {
                System.out.println("Animal does not exist! Try again!");
                continue;
            }

            String typeOfFood = scanner.next();
            int amount = scanner.nextInt();
            Food food = null;
            if ("Vegetable".equals(typeOfFood)) {
                food = new Vegetable();
            } else if ("Meat".equals(typeOfFood)) {
                food = new Meat();
            }
            animal.eat(food, amount);

            animalList.add(animal);
        }
        animalList.forEach(System.out::print);
    }
}
