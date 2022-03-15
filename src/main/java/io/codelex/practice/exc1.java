package io.codelex.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class exc1 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1988, 6, 4);
        LocalDate date2 = LocalDate.of(2022, 6, 4);
        long weeks = ChronoUnit.WEEKS.between(date1, date2);
        long hoursWorked = (ChronoUnit.DAYS.between(date1, date2) - (2 * weeks)) * 8;
        System.out.println(hoursWorked);

    }
}
