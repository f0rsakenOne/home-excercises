package io.codelex.arrays.exercises;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args){
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i =0 ; i<numbers.length;i++){
            numbers[i] = 1+random.nextInt(100);
        }
        int[] numbers2 = numbers.clone();

        for (int i =0 ; i<numbers.length;i++){
            if (i==numbers.length-1){
                numbers[i]=-7;
            }
        }
        System.out.println("Array1 : " + Arrays.toString(numbers));
        System.out.println("Array2 : " + Arrays.toString(numbers2));
    }
}
