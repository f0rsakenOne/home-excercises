package io.codelex.arithmetic.exercises;

public class Product1ToN {
    public static void main(String[] args) {
        int product = 1;
        int lowerBound = 1;
        int upperBound = 10;
        for (int number = lowerBound; number <= upperBound; ++number) {
            product *= number;
        }
        System.out.printf("The product of %d to %d is %d%n",lowerBound,upperBound,product);
    }
}
