package io.codelex.advancedTest.basket;

public class CantMixBasketException extends Exception {

  CantMixBasketException(String error) {
    super(error);
  }
}
