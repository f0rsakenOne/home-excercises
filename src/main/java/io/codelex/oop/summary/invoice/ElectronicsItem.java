package io.codelex.oop.summary.invoice;

import java.text.DecimalFormat;

public class ElectronicsItem extends AbstractItem {

  private int power;

  public ElectronicsItem(String name, Double priceWithoutVAT, int power) {
    super(name, priceWithoutVAT);
    this.power = power;
  }

  @Override
  public String fullInfo() {
    DecimalFormat format = new DecimalFormat("0.00");
    return super.getName() + ", " + format.format(super.getPrice()) + " EUR, " + power + "W";
  }
}
