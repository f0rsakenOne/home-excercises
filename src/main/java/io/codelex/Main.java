package io.codelex;

public class Main {
    public static void main(String[] args) {
        MyAdvancedInterface<Integer> myFunction = (Integer number) -> number * 2;

        System.out.println(myFunction.calculate(10));
    }
}
