package io.codelex.exceptions;

import java.util.Arrays;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            System.out.println(12 / 0);
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public static void main(String[] args) {
        Exercise2 a = new Exercise2();
        a.methodA();
    }
}
