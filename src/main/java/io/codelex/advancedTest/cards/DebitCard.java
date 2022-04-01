package io.codelex.advancedTest.cards;

public class DebitCard extends Card {

  public DebitCard(int number, String fullName, String ccv, double balance) {
    super(number, fullName, ccv, balance);
  }

  @Override
  void addMoney(double amount) throws NotEnoughFundsException {
    if (getBalance() + amount > 10000) {
      throw new NotEnoughFundsException("Warning: Too much money");
    } else {
      super.setBalance(getBalance() + amount);
    }
  }

  @Override
  void takeMoney(double amount) {
    super.setBalance(getBalance() - amount);
  }
}
