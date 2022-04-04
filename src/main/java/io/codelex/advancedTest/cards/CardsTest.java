package io.codelex.advancedTest.cards;

import java.math.BigDecimal;

public class CardsTest {

  public static void main(String[] args) throws NotEnoughFundsException {
    CreditCard creditCard = new CreditCard(1848454, "John Smith", "963", BigDecimal.valueOf(2000));
    DebitCard debitCard = new DebitCard(4545454, "Smith John", "456", BigDecimal.valueOf(9999));
    System.out.println(creditCard.getBalance());
    System.out.println(debitCard.getBalance());
    creditCard.takeMoney(BigDecimal.valueOf(1901.15));
    debitCard.addMoney(BigDecimal.valueOf(2.5));
    System.out.println(creditCard.getBalance());
    System.out.println(debitCard.getBalance());
    creditCard.takeMoney(BigDecimal.valueOf(100));
  }
}
