package io.codelex.arithmetic.exercises;

public class Exercise8 {
    public static double minPayHours = 8.00;
    public static int maxHours = 60;

    public static void Employee(String name, double basePay, int hours) {
        if (validatePay(basePay)) {
            System.out.printf("[Error]%s base pay is bellow minimum.%n", name);
        } else if (validateHours(hours)) {
            System.out.printf("[Error]%s has worked too many hours.%n", name);
        } else {
            double money = salaryCalc(basePay, hours);
            System.out.printf("%s salary is $%.2f%n", name, money);
        }
    }

    public static double salaryCalc(double pay, int hours) {
        return pay * hours;
    }

    public static boolean validatePay(double pay) {
        return pay < minPayHours;
    }

    public static boolean validateHours(int hours) {
        return hours > maxHours;
    }

    public static void main(String[] args) {
        Employee("Employee1", 7.50, 35);
        Employee("Employee2", 8.20, 47);
        Employee("Employee3", 10.20, 73);
    }


}
