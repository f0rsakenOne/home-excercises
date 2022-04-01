package io.codelex.advancedTest.cards;

public class CreditCard extends Card {


  public CreditCard(int number, String fullName, String ccv, double balance) {
    super(number, fullName, ccv, balance);
  }

  @Override
  void addMoney(double amount) {
    super.setBalance(getBalance() + amount);
  }

  @Override
  void takeMoney(double amount) throws NotEnoughFundsException {
    if (getBalance() - amount < 100) {
      throw new NotEnoughFundsException("Warning: Low funds");
    } else {
      super.setBalance(getBalance() - amount);
    }
  }
}
