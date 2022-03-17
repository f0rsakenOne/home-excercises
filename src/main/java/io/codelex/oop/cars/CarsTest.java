package io.codelex.oop.cars;

public class CarsTest {
    public static void main(String[] args) {
        Manufacturer volvo = new Manufacturer("Volvo", 1927, "Sweden");
        Manufacturer nissan = new Manufacturer("Nissan", 1933, "Japan");
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer testM = new Manufacturer("TEstr", 2020, "Latvia");
        Car car1 = new Car("Volvo v40", "v40", 1576.26, 1993, volvo, "V8");
        Car car2 = new Car("Nissan Skyline", "R34", 5485.54, 1999, nissan, "V12");
        Car car3 = new Car("BMW 3 series", "E36", 3215.25, 1990, bmw, "V8");
        Car car4 = new Car("SUPER CAR", "ULTRA", 999999, 2022, "S4");
        car4.addManufacturer(volvo);
        car4.addManufacturer(nissan);
        car4.addManufacturer(bmw);
        car4.addManufacturer(testM);
        CarService service = new CarService();
        service.addCar(car1);
        service.addCar(car2);
        service.addCar(car3);
        service.addCar(car4);
        service.getList();
        System.out.println("-=-=-=-=-=-=-=");
        service.getBefore99();

        System.out.println("-=-=-=-=-=-=-=");
        service.getExpensive();

        System.out.println("-=-=-=-=-=-=-=");
        service.getCheapest();

        System.out.println("-=-=-=-=-=-=-=");
        service.getMostManufacturers();

        System.out.println("-=-=-=-=-=-=-=");
        service.getAscendingOrDescending("descending");

        System.out.println("-=-=-=-=-=-=-=");
        service.getAscendingOrDescending("ascending");

        System.out.println("-=-=-=-=-=-=-=");
        service.checkIfIsOnList("Nissan Skyline");

        System.out.println("-=-=-=-=-=-=-=");
        service.getSpecificManufacturer("volvo");

        System.out.println("-=-=-=-=-=-=-=");
        service.getManufactureByDate(1933, "!=");

    }
}
