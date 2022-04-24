package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturer = new ArrayList<Manufacturer>();
    private EngineType engineType;

    public Car(String name, String model, double price,
               int yearOfManufacture, Manufacturer manufacturer, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer.add(manufacturer);
        this.engineType = engineType;
    }

    public Car(String name, String model, double price,
               int yearOfManufacture, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void addManufacturer(Manufacturer nameOfManufacturer) {
        this.manufacturer.add(nameOfManufacturer);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", model='" + model + '\'' +
                        ", price=" + price +
                        ", yearOfManufacture=" + yearOfManufacture +
                        ", manufacturer=" + manufacturer +
                        ", engineType=" + engineType + '\n'
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture
                && Objects.equals(name, car.name)
                && Objects.equals(model, car.model)
                && Objects.equals(price, car.price)
                && Objects.equals(manufacturer, car.manufacturer)
                && Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturer, engineType);
    }
}
