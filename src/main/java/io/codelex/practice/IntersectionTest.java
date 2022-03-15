package io.codelex.practice;

import java.time.LocalDate;

public class IntersectionTest {
    public static void main(String[] args) {
        // second period is inside first
        // |---------| = first period
        //    |----|   = second period
        LocalDate firstStart = LocalDate.of(2022, 2, 15);
        LocalDate firstEnd = LocalDate.of(2022, 2, 28);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 2, 20);
        LocalDate secondEnd = LocalDate.of(2022, 2, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        System.out.println(overlap.toString());

        //  |----|    = first period
        //     |---|  = second period
        LocalDate thirdStart = LocalDate.of(2022, 1, 1);
        LocalDate thirdEnd = LocalDate.of(2022, 1, 15);
        DatePeriod thirdPeriod = new DatePeriod(thirdStart, thirdEnd);

        LocalDate forthStart = LocalDate.of(2022, 1, 10);
        LocalDate forthEnd = LocalDate.of(2022, 1, 25);
        DatePeriod forthPeriod = new DatePeriod(forthStart, forthEnd);
        DatePeriod overlap2 = thirdPeriod.intersection(forthPeriod);
        System.out.println(overlap2.toString());

        //dont intersect
        DatePeriod overlap3 = firstPeriod.intersection(forthPeriod);
        //es nezināju, vai pašā klasē ir jāpārbauda, vai null, tāpēc es to izdarīju
        System.out.println(overlap3 == null ? "null" : overlap3.toString());


    }
}
