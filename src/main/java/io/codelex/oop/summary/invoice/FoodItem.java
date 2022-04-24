package io.codelex.oop.summary.invoice;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {

  private LocalDate expirationDate;

  public FoodItem(String name, Double priceWithoutVAT, LocalDate expirationDate) {
    super(name, priceWithoutVAT);
    this.expirationDate = expirationDate;
  }

  @Override
  public String fullInfo() {
    DecimalFormat format = new DecimalFormat("0.00");
    return super.getName() + ", " + format.format(super.getPrice()) + " EUR, best before: "
        + expirationDate;
  }
}
