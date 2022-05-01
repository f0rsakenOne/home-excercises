package io.codelex.advancedTest.cards;

import java.math.BigDecimal;

public class CreditCard extends Card {


  public CreditCard(int number, String fullName, String ccv, BigDecimal balance) {
    super(number, fullName, ccv, balance);
  }

  @Override
  void addMoney(BigDecimal amount) {
    super.setBalance(getBalance().add(amount));
  }

  @Override
  void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
    if ((getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0)) {
      throw new NotEnoughFundsException("Error: balance can't be less than 0");
    } else {
      super.setBalance(getBalance().subtract(amount));
      if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
        System.out.println("Warning: Low funds");
      }
    }
  }
}
