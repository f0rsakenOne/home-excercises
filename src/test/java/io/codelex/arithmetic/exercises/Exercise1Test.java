package io.codelex.arithmetic.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1Test {

    @Test
    void xIs15() {
        //GIVEN
        int x = 15;
        int y = 32;
        boolean expectedResult = true;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void yIs15() {
        //GIVEN
        int x = 14;
        int y = 15;
        boolean expectedResult = true;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void xMinusYIs15() {
        //GIVEN
        int x = 45;
        int y = 30;
        boolean expectedResult = true;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void yMinusXIs15() {
        //GIVEN
        int x = 30;
        int y = 45;
        boolean expectedResult = true;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void xIsNot15() {
        //GIVEN
        int x = 16;
        int y = 32;
        boolean expectedResult = false;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void yIsNot15() {
        //GIVEN
        int x = 14;
        int y = 99;
        boolean expectedResult = false;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void xMinusYIsNot15() {
        //GIVEN
        int x = 100;
        int y = 30;
        boolean expectedResult = false;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void yMinusXIsNot15() {
        //GIVEN
        int x = 30;
        int y = 99;
        boolean expectedResult = false;

        //WHEN
        boolean actualResult = Exercise1.check15(x, y);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
