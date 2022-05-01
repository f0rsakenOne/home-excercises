package io.codelex.advancedTest.basket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

  @Test
  public void shouldAddToBasket() {
    Basket<Apple> basket = new Basket();
    Apple apple = new Apple();
    basket.addToBasket(apple);
    Assertions.assertEquals(1, basket.size);
  }

  @Test
  public void shouldRemoveFromBasket() {
    Basket<Apple> basket = new Basket();
    Apple apple = new Apple();
    basket.addToBasket(apple);
    basket.removeFromBasket(apple);
    Assertions.assertEquals(0, basket.size);
  }

  @Test
  public void shouldThrowErrorWhenRemovingFromZero() {
    Basket<Apple> basket = new Basket();
    Apple apple = new Apple();
    Exception e = Assertions.assertThrows(BasketEmptyException.class,
        () -> basket.removeFromBasket(apple));
    Assertions.assertEquals("The basket is empty", e.getMessage());
  }

  @Test
  public void shouldThrowErrorWhenAddingMoreThanTen() {
    Basket<Apple> basket = new Basket();
    Apple apple1 = new Apple();
    Apple apple2 = new Apple();
    Apple apple3 = new Apple();
    Apple apple4 = new Apple();
    Apple apple5 = new Apple();
    Apple apple6 = new Apple();
    Apple apple7 = new Apple();
    Apple apple8 = new Apple();
    Apple apple9 = new Apple();
    Apple apple10 = new Apple();
    Apple apple11 = new Apple();
    basket.addToBasket(apple1);
    basket.addToBasket(apple2);
    basket.addToBasket(apple3);
    basket.addToBasket(apple4);
    basket.addToBasket(apple5);
    basket.addToBasket(apple6);
    basket.addToBasket(apple7);
    basket.addToBasket(apple8);
    basket.addToBasket(apple9);
    basket.addToBasket(apple10);
    Exception e = Assertions.assertThrows(BasketFullException.class,
        () -> basket.addToBasket(apple11));
    Assertions.assertEquals("The basket is full", e.getMessage());
  }

  @Test
  public void shouldAddMushrooms() {
    Basket<Mushroom> basket = new Basket();
    Mushroom mushroom = new Mushroom();
    basket.addToBasket(mushroom);
    Assertions.assertEquals(Mushroom.class, basket.basket.get(0).getClass());
  }
  

}
