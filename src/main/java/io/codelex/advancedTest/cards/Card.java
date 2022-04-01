package io.codelex.advancedTest.cards;

public abstract class Card {

  private int number;
  private String fullName;
  private String ccv;
  private double balance;

  public Card(int number, String fullName, String ccv, double balance) {
    this.number = number;
    this.fullName = fullName;
    this.ccv = ccv;
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  abstract void addMoney(double amount) throws NotEnoughFundsException;

  abstract void takeMoney(double amount) throws NotEnoughFundsException;
}
