package io.codelex.oop.summary;

public class LazyBoxTest {

  static LazyBox<Integer> staticBox = new LazyBox<>(LazyBoxTest::doLargeCalculation);


  public static void main(String[] args) {
    LazyBox<Integer> box = new LazyBox<>(LazyBoxTest::doLargeCalculation);
    LazyBox<String> textBox = box.map(Object::toString);
    LazyBox<String> upperTextBox = textBox.map((String::toUpperCase));
    LazyBox<String> fullTextBox = upperTextBox.map((String s) -> "Results is " + s);

    String result = fullTextBox.get();

    System.out.println(result);


  }

  public static Integer doLargeCalculation() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
    return 153;
  }

  public static <T> void printOutBoxContents(LazyBox<T> box) {
    System.out.println(box.get());
  }


}
