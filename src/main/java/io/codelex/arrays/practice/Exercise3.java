package io.codelex.arrays.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise3 {


    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};



        int sum = 0;
        for (int i : numbers){
            sum+=i;
        }

        BigDecimal average = BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(numbers.length), 2,RoundingMode.CEILING);

        System.out.println("Average value of the array elements is : " + average);

    }
}
