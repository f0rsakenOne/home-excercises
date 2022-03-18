package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class ImperialToMetricTester {
    public static void main(String[] args) {
        BigDecimal valueToConvert = new BigDecimal("10.5");
        BigDecimal result = MeasurmentConverter.convert(ConversionType.CENTIMETERS_TO_INCHES, valueToConvert);
        System.out.println(result);
    }
}
