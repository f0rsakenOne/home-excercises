package io.codelex.advancedTest.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

  List<T> basket = new ArrayList<>();
  int size;

  public void addToBasket(T item) {
    if (size >= 10) {
      throw new BasketFullException("The basket is full");
    } else {
      basket.add(item);
      size += 1;
    }
  }

  public void removeFromBasket(T item) {
    if (size <= 0) {
      throw new BasketEmptyException("The basket is empty");
    } else {
      basket.remove(item);
      size -= 1;
    }
  }
}
