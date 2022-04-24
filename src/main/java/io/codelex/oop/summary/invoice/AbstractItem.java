package io.codelex.oop.summary.invoice;

public abstract class AbstractItem implements Item {

  private String name;
  private Double priceWithoutVAT;

  public AbstractItem(String name, Double priceWithoutVAT) {
    this.name = name;
    this.priceWithoutVAT = priceWithoutVAT;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Double getPrice() {
    return priceWithoutVAT;
  }

  @Override
  public abstract String fullInfo();
}
