package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Lexus lexus = new Lexus();
        Bmw bmw = new Bmw();
        Tesla tesla = new Tesla();
        Audi audi = new Audi();

        List<Car> cars = new ArrayList<>();
        cars.add(lexus);
        cars.add(bmw);
        cars.add(tesla);
        cars.add(audi);

        int fastestSpeed = Integer.parseInt(lexus.showCurrentSpeed());
        Car fastestCar = lexus;

        for (int i = 0; i < 10; i++) {
            for (Car x : cars) {
                if (i >= 3 && x instanceof Nitro) {
                    ((Nitro) x).useNitrousOxideEngine();
                    System.out.println(x);
                    System.out.println(x.showCurrentSpeed());
                } else {
                    x.speedUp();
                    System.out.println(x);
                    System.out.println(x.showCurrentSpeed());
                }
                if (Integer.parseInt(x.showCurrentSpeed()) > fastestSpeed) {
                    fastestSpeed = Integer.parseInt(x.showCurrentSpeed());
                    fastestCar = x;
                }
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-");
        }

        System.out.println("Fastest car is " + fastestCar);
        System.out.println("It's speed is " + fastestSpeed);
        fastestCar.startEngine();

    }
}
