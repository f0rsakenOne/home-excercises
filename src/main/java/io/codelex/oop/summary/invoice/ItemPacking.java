package io.codelex.oop.summary.invoice;

import java.text.DecimalFormat;

public class ItemPacking implements Service {

  static final String name = "Item packing";
  static final double price = 5.00;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Double getPrice() {
    return price;
  }

  @Override
  public String fullInfo() {
    DecimalFormat format = new DecimalFormat("0.00");
    return name + ", " + format.format(price) + " EUR";
  }
}
