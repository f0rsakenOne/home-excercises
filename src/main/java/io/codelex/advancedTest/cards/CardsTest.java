package io.codelex.advancedTest.cards;

public class CardsTest {

  public static void main(String[] args) throws NotEnoughFundsException {
    CreditCard creditCard = new CreditCard(1848454, "John Smith", "963", 2000.0);
    DebitCard debitCard = new DebitCard(4545454, "Smith John", "456", 9999);
    System.out.println(creditCard.getBalance());
    System.out.println(debitCard.getBalance());
    //creditCard.takeMoney(1901.15);
    //debitCard.addMoney(2.50);
  }
}
