package io.codelex.oop.summary.invoice;

import java.time.LocalDate;

public class OrderProgram {

  public static void main(String[] args) throws WrongOrderException, BadFoodException {
    FoodItem milk = new FoodItem("Milk", 0.75, LocalDate.of(2022, 4, 1));
    ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);
    HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");
    FoodItem spoiledMilk = new FoodItem("Milk", 0.75, LocalDate.of(2022, 2, 1));
    ItemPacking itemPacking = new ItemPacking();

    Order order = new Order();
    Order order1 = new Order();
    //order1.addToList(spoiledMilk);
    order.addToList(milk);
    order.addToList(radio);
    order.addToList(bucket);
    order.addToList(itemPacking);
    Invoice invoice = new Invoice(order, "INV123");
    //Invoice invoice2 = new Invoice(order1, "INV124");
    System.out.println(invoice.printInBox());
    //System.out.println(invoice2.printInBox());
  }
}
