package io.codelex.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (isOverlapping(this.start, this.end, secondPeriod.start, secondPeriod.end)) {
            if (isInsideAnother(this.start, this.end, secondPeriod.start, secondPeriod.end)) {
                if (this.start.isBefore(secondPeriod.start)) {
                    return new DatePeriod(secondPeriod.start, secondPeriod.end);
                } else {
                    return new DatePeriod(this.start, this.end);
                }
            }
            if (isContainsAnother(this.start, this.end, secondPeriod.start, secondPeriod.end)) {
                if (this.start.isBefore(secondPeriod.start)) {
                    return new DatePeriod(secondPeriod.start, this.end);
                } else {
                    return new DatePeriod(this.start, secondPeriod.end);
                }
            }
        }
        return null;
    }

    private boolean isOverlapping(LocalDate start1, LocalDate end1, LocalDate start2, LocalDate end2) {
        return start2.isBefore(end1) && end2.isAfter(start1);
    }

    private boolean isInsideAnother(LocalDate start1, LocalDate end1, LocalDate start2, LocalDate end2) {
        return ((start1.isBefore(start2) && end2.isBefore(end1)) || (start2.isBefore(start1) && end1.isBefore(end2)));
    }

    private boolean isContainsAnother(LocalDate start1, LocalDate end1, LocalDate start2, LocalDate end2) {
        return (start2.isBefore(start1) && end2.isBefore(end1)) || (start1.isBefore(start2) && end1.isBefore(end2));
    }

    @Override
    public String toString() {
        return "start date = " + start.getDayOfMonth() + "." + start.getMonthValue() + "." + start.getYear() +
                ", end date = " + end.getDayOfMonth() + "." + end.getMonthValue() + "." + end.getYear()
                ;
    }
}
