package io.codelex.oop.summary.invoice;

public class WrongOrderException extends Exception {

  public WrongOrderException() {
    super("Order can't be empty!");
  }
}
