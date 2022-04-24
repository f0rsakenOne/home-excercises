package io.codelex.oop.summary.invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {

  private List<SellableThing> order = new ArrayList<>();

  public void addToList(SellableThing item) throws BadFoodException {
    if (isSpoiled(item)) {
      throw new BadFoodException();
    } else {
      this.order.add(item);
    }

  }

  public boolean isSpoiled(SellableThing item) {
    Pattern DATE_PATTERN = Pattern.compile(
        "\\d{4}-\\d{2}-\\d{2}");
    if (item instanceof FoodItem) {
      Matcher matcher = DATE_PATTERN.matcher(item.fullInfo());
      if (matcher.find()) {
        return LocalDate.now().isAfter(LocalDate.parse(matcher.group()));
      }
    }
    return false;
  }

  public List<SellableThing> getList() {
    return this.order;
  }

  public String getOrder() {
    return order.stream()
        .map(abstractItem -> order.indexOf(abstractItem) + 1 + ". " + abstractItem.fullInfo())
        .collect(Collectors.joining("\n"));
  }

}
