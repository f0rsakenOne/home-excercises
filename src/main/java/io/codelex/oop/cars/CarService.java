package io.codelex.oop.cars;

import java.util.HashMap;
import java.util.TreeMap;

public class CarService {
    private HashMap<String, Car> carService = new HashMap<String, Car>();


    public HashMap<String, Car> getCarService() {
        return carService;
    }

    public void addCar(Car someCarName) {
        this.carService.put(someCarName.getName(), someCarName);
    }

    public void removeCar(String nameOfCar) {
        this.carService.remove(nameOfCar);
    }

    public void getList() {
        for (String key : carService.keySet()) {
            System.out.println(key);
        }
    }

    public void getV12() {
        for (Car car : carService.values()) {
            if (car.getEngineType() == EngineType.V12) {
                System.out.println(car);
            }
        }
    }

    public void getBefore99() {
        for (Car car : carService.values()) {
            if (car.getYearOfManufacture() < 1999) {
                System.out.println(car.getName() + " is manufactured before 1999");
            }
        }
    }

    public void getExpensive() {
        double maxPrice = 0;
        Car expensiveCar = null;
        for (Car car : carService.values()) {
            if (car.getPrice() > maxPrice) {
                maxPrice = car.getPrice();
                expensiveCar = car;
            }
        }
        System.out.println(expensiveCar.getName() + " is the most expensive car (" + expensiveCar.getPrice() + "$)");
    }

    public void getCheapest() {
        double minPrice = Double.MAX_VALUE;
        Car cheapestCar = null;
        for (Car car : carService.values()) {
            if (car.getPrice() < minPrice) {
                minPrice = car.getPrice();
                cheapestCar = car;
            }
        }
        System.out.println(cheapestCar.getName() + " is the most cheapest car (" + cheapestCar.getPrice() + "$)");
    }

    public void getMostManufacturers() {
        for (Car car : carService.values()) {
            if (car.getManufacturer().size() >= 3) {
                System.out.println(car.getName() + " manufactured by " + car.getManufacturer());
            }
        }
    }

    public void getAscendingOrDescending(String arg) {
        TreeMap<String, Car> sorted = new TreeMap<>(this.carService);
        if (arg.equalsIgnoreCase("ascending")) {
            for (String key : sorted.keySet()) {
                System.out.println(key);
            }
        } else if (arg.equalsIgnoreCase("descending")) {
            for (String key : sorted.descendingMap().keySet()) {
                System.out.println(key);
            }
        } else {
            System.out.println("Not a valid sorting order :(");
        }
    }

    public void checkIfIsOnList(String name) {
        if (this.carService.containsKey(name)) {
            System.out.println(name + " is on the list!");
        } else {
            System.out.println(name + " is not on the list :(");
        }
    }

    public void getSpecificManufacturer(String name) {
        for (Car car : carService.values()) {
            car.getManufacturer().forEach((element) -> {
                if (element.getName().equalsIgnoreCase(name)) {
                    System.out.println(car.getName() + " manufactured by " + element.getName());
                }
            });
        }
    }

    public void getManufactureByDate(int date, String expression) {
        for (Car car : carService.values()) {
            car.getManufacturer().forEach((element) -> {
                if ("<".equals(expression)) {
                    if (element.getYear() < date) {
                        System.out.println(car.getName() + " , Manufactured by " + element.getName() +
                                " established in " + element.getYear());
                    }
                } else if (">".equals(expression)) {
                    if (element.getYear() > date) {
                        System.out.println(car.getName() + " , Manufactured by " + element.getName() +
                                " established in " + element.getYear());
                    }
                } else if ("<=".equals(expression)) {
                    if (element.getYear() <= date) {
                        System.out.println(car.getName() + " , Manufactured by " + element.getName() +
                                " established in " + element.getYear());
                    }
                } else if ("=>".equals(expression)) {
                    if (element.getYear() >= date) {
                        System.out.println(car.getName() + " , Manufactured by " + element.getName() +
                                " established in " + element.getYear());
                    }
                } else if ("=".equals(expression)) {
                    if (element.getYear() == date) {
                        System.out.println(car.getName() + " , Manufactured by " + element.getName() +
                                " established in " + element.getYear());
                    }
                } else if ("!=".equals(expression)) {
                    if (element.getYear() != date) {
                        System.out.println(car.getName() + " , Manufactured by " + element.getName() +
                                " established in " + element.getYear());
                    }
                }
            });
        }
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carService=" + carService +
                '}';
    }
}
