package io.codelex.practice;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        DatePeriod intersection = null;
        if (secondPeriod.start.isBefore(this.end)) {
            intersection = new DatePeriod(secondPeriod.start, this.end);
        } else if (this.start.isBefore(secondPeriod.end)) {
            intersection = new DatePeriod(this.start, secondPeriod.end);
        }

        return intersection;
    }

    @Override
    public String toString() {
        return
                "start date = " + start.getDayOfMonth() + "." + start.getMonthValue() + "." + start.getYear() +
                        ", end date = " + end.getDayOfMonth() + "." + end.getMonthValue() + "." + end.getYear()
                ;
    }
}
