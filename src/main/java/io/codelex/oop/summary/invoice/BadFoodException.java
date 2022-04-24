package io.codelex.oop.summary.invoice;

public class BadFoodException extends Exception {

  public BadFoodException() {
    super("You can't add spoiled food to order!");
  }
}
