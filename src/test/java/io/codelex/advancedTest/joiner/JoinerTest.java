package io.codelex.advancedTest.joiner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

  @Test
  void ShouldJoinIntegers() {
    Joiner joiner = new Joiner<>("-");
    String expectedResult = "1-2-3-4-5";

    Assertions.assertEquals(expectedResult, joiner.join(1, 2, 3, 4, 5));
  }

  @Test
  void ShouldJoinStrings() {
    Joiner joiner = new Joiner<>("=");
    String expectedResult = "CAB=def=QwErTy";

    Assertions.assertEquals(expectedResult, joiner.join("CAB", "def", "QwErTy"));
  }

  @Test
  void ShouldJoinDouble() {
    Joiner joiner = new Joiner<>("+");
    String expectedResult = "2.5+3.66+8.789";

    Assertions.assertEquals(expectedResult, joiner.join(2.5, 3.66, 8.789));
  }

  @Test
  void JoinSingleElement() {
    Joiner joiner = new Joiner<>("-");
    String expectedResult = "1";

    Assertions.assertEquals(expectedResult, joiner.join(1));
  }

  @Test
  void JoinNoElement() {
    Joiner joiner = new Joiner<>("-");
    String expectedResult = "";

    Assertions.assertEquals(expectedResult, joiner.join());
  }

}
