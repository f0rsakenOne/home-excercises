package io.codelex.classesandobjects.exercise;

public class ProductMain {
    public static void main(String[] args){
        Product product1 = new Product("Logitech mouse",70.00,14);
        Product product2 = new Product("iPhone 5s", 999.99,3);
        Product product3 = new Product("Epson EB-U05", 440.46,1);
        product1.printProduct();
        product2.printProduct();
        product3.printProduct();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        product1.changePrice(0.69);
        product2.changePrice(0.99);
        product3.changePrice(4.46);

        product1.changeQuantity(69);
        product2.changeQuantity(420);
        product3.changeQuantity(46);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

    }
}
