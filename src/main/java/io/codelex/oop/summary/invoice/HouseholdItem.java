package io.codelex.oop.summary.invoice;

import java.text.DecimalFormat;

public class HouseholdItem extends AbstractItem {

  private String color;

  public HouseholdItem(String name, Double priceWithoutVAT, String color) {
    super(name, priceWithoutVAT);
    this.color = color;
  }

  @Override
  public String fullInfo() {
    DecimalFormat format = new DecimalFormat("0.00");
    return super.getName() + ", " + format.format(super.getPrice()) + " EUR, color: " + color;
  }
}
