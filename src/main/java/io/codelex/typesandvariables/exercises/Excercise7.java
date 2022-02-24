package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = input.nextLine();
        int upperCaseLetters = 0;
        for (byte i = 0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                upperCaseLetters++;
            }
        }
        System.out.printf("%s : has %d upper case letters.",str,upperCaseLetters);
    }
}
