package io.codelex.multithreading.simplified;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberOperations {

    /*
    Given the list of numbers calculate and print out:
    sum of numbers
    average value of numbers
    sum of each second number

    All operations must be done in parallel
    */

    public static void main(String[] args) {
        List<Integer> numberList = createNumberList();
        Runnable sumOfArr = () -> {
            AtomicInteger sum = new AtomicInteger();
            numberList.forEach(sum::addAndGet);
            System.out.println(sum);
        };

        Runnable avrgOfArr = () -> {
            AtomicInteger sum = new AtomicInteger();
            numberList.forEach(sum::addAndGet);
            int avrg = sum.get() / numberList.size();
            System.out.println(avrg);

        };

        Runnable sumOfSecondNumber = () -> {
            int sum = 0;
            for (int i = 0; i < numberList.size(); i += 2) {
                sum += numberList.get(i);
            }
            System.out.println(sum);
        };
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(sumOfArr);
        executor.execute(avrgOfArr);
        executor.execute(sumOfSecondNumber);
        executor.shutdown();

    }

    public static List<Integer> createNumberList() {
        return Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37,
                39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81,
                83, 85, 87, 89, 91, 93, 95, 97, 99, 101, 103, 105, 107, 109, 111, 113, 115, 117, 119,
                121, 123, 125, 127, 129, 131, 133, 135, 137, 139, 141, 143, 145, 147, 149, 151, 153,
                155, 157, 159, 161, 163, 165, 167, 169, 171, 173, 175, 177, 179, 181, 183, 185, 187,
                189, 191, 193, 195, 197, 199);
    }


}
