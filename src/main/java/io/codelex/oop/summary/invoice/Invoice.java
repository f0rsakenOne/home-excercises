package io.codelex.oop.summary.invoice;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Invoice {

  private Order order;
  private String invoiceNumber;
  private InvoiceStatus invoiceStatus;
  private double priceWithoutVAT;
  private double priceWithVAT;

  public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
    if (order.getOrder().length() == 0) {
      throw new WrongOrderException();
    } else {
      this.order = order;
    }
    this.invoiceNumber = invoiceNumber;
    this.priceWithoutVAT = order.getList().stream().map(SellableThing::getPrice)
        .reduce(0.0, Double::sum);
    this.priceWithVAT = priceWithoutVAT + priceWithoutVAT * 0.21;
    this.invoiceStatus = InvoiceStatus.APPROVED;
  }


  public void send() {
    this.invoiceStatus = InvoiceStatus.SENT;
  }

  private List<String> getInvoiceAsList() throws WrongOrderException {
    DecimalFormat format = new DecimalFormat("0.##");
    return Arrays.stream(("INVOICE NUMBER: " + invoiceNumber + "\n"
        + "STATUS: " + invoiceStatus + "\n"
        + order.getOrder() + "\n"
        + "SUM: " + format.format(priceWithoutVAT) + " EUR\n"
        + "VAT (21%): " + format.format(priceWithVAT - priceWithoutVAT) + " EUR\n"
        + "TOTAL: " + format.format(priceWithVAT) + " EUR\n").split("\n")).toList();
  }

  public String printInBox() throws WrongOrderException {
    StringBuilder result = new StringBuilder();
    int maxLengthOfString =
        getInvoiceAsList().stream().mapToInt(String::length).max().getAsInt() + 10;

    result.append("=".repeat(maxLengthOfString)).append("\n");
    getInvoiceAsList().forEach(
        s -> result.append("= ")
            .append(s)
            .append(" ".repeat(maxLengthOfString - 3 - s.length()))
            .append("=")
            .append("\n")
    );
    result.append("=".repeat(maxLengthOfString));
    return result.toString();
  }

}
