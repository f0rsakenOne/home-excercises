package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        return radius.multiply(BigDecimal.valueOf(Math.PI)).multiply(BigDecimal.valueOf(2));
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h).multiply(BigDecimal.valueOf(0.5));
    }
}

