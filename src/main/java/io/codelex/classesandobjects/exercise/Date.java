package io.codelex.classesandobjects.exercise;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDay(day)) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (isValidMonth(month)) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (isValidYear(year)) {
            this.year = year;
        } else {
            this.year = 1970;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDay(day)) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    private boolean isValidDay(int day) {
        return day > 0 && day <= 31;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidMonth(month)) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    private boolean isValidMonth(int month) {
        return month > 0 && month <= 12;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidYear(year)) {
            this.year = year;
        } else {
            this.year = 1970;
        }
    }

    private boolean isValidYear(int year) {
        return year > 0;
    }

    public void displayDate() {
        System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
    }

    public static void main(String[] args) {
        Date date1 = new Date(20, 9, 2001);
        Date date2 = new Date(30, 12, 1998);
        Date date3 = new Date(10, 7, 2020);
        Date date4 = new Date(100, -14, 0);

        date1.displayDate();
        date2.displayDate();
        date3.displayDate();
        date4.displayDate();

        date1.setYear(-1);
        date2.setYear(2022);
        date3.setMonth(12);
        date4.setDay(15);
        System.out.println("------------");
        date1.displayDate();
        date2.displayDate();
        date3.displayDate();
        date4.displayDate();

    }
}
