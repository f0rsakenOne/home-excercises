package io.codelex.advancedTest.cards;

import java.math.BigDecimal;

public abstract class Card {

  private int number;
  private String fullName;
  private String ccv;
  private BigDecimal balance;

  public Card(int number, String fullName, String ccv, BigDecimal balance) {
    this.number = number;
    this.fullName = fullName;
    this.ccv = ccv;
    this.balance = balance;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  abstract void addMoney(BigDecimal amount) throws NotEnoughFundsException;

  abstract void takeMoney(BigDecimal amount) throws NotEnoughFundsException;
}
