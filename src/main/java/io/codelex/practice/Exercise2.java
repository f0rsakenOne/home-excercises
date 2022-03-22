package io.codelex.practice;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 6, 1);
        LocalDate date2 = LocalDate.of(2022, 9, 30);
        LocalDate temp2 = date1.plusDays(14);

        while ( date1.isBefore(date2) ) {
            if (date1.equals(temp2)) {
                System.out.println("Server should be updated on : " + date1.getDayOfMonth() + " " + date1.getMonth());
                temp2 = temp2.plusDays(14);
            }
            date1 = date1.plusDays(1);
        }
    }
}
