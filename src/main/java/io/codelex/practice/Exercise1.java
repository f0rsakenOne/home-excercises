package io.codelex.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise1 {
    public static void main(String[] args) {
        final LocalDate date1 = LocalDate.of(1988, 6, 4);
        final LocalDate date2 = LocalDate.of(2022, 6, 4);
        final long weeks = ChronoUnit.WEEKS.between(date1, date2);
        final long hoursWorked = (ChronoUnit.DAYS.between(date1, date2) - (2 * weeks)) * 8;
        System.out.println(hoursWorked);
    }
}
