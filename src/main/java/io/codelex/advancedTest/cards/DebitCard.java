package io.codelex.advancedTest.cards;

import java.math.BigDecimal;

public class DebitCard extends Card {

  public DebitCard(int number, String fullName, String ccv, double balance) {
    super(number, fullName, ccv, balance);
  }

  @Override
  void addMoney(double amount) {
    super.setBalance(getBalance().add(BigDecimal.valueOf(amount)));
    if (getBalance().compareTo(BigDecimal.valueOf(10000)) > 0) {
      System.out.println("Warning: Too much money");
    }
  }

  @Override
  void takeMoney(double amount) throws NotEnoughFundsException {
    if ((getBalance().subtract(BigDecimal.valueOf(amount)).compareTo(BigDecimal.ZERO) < 0)) {
      throw new NotEnoughFundsException("Error: balance can't be less than 0");
    } else {
      super.setBalance(getBalance().subtract(BigDecimal.valueOf(amount)));
    }
  }
}
