package io.codelex.practice;

import java.time.LocalDate;

public class IntersectionTest {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        DatePeriod overlap2 = secondPeriod.intersection(firstPeriod);
        System.out.println(overlap.toString());
        System.out.println(overlap2.toString());
//overlap variable should have start date 10.01.2022 and end date 15.01.2022
    }
}
