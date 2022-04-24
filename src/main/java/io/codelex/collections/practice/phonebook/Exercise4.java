package io.codelex.collections.practice.phonebook;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> nameSet = new HashSet<>();
        while ( true ) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            if (name.length() == 0) {
                break;
            }
            nameSet.add(name);
        }
        System.out.print("Unique name list contains: ");
        for (String name : nameSet) {
            System.out.print(name + " ");
        }
    }
}
