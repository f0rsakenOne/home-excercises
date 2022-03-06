package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your string : ");
        String phoneLetters = in.nextLine().toLowerCase();
        if (phoneLetters.matches("[a-z|#*\\s]*")) {
            for (int i = 0; i < phoneLetters.length(); i++) {
                char letter = phoneLetters.charAt(i);
                switch (letter) {
                    case 'a', 'b', 'c' -> System.out.print(2);
                    case 'd', 'e', 'f' -> System.out.print(3);
                    case 'g', 'h', 'i' -> System.out.print(4);
                    case 'j', 'k', 'l' -> System.out.print(5);
                    case 'm', 'n', 'o' -> System.out.print(6);
                    case 'p', 'q', 'r', 's' -> System.out.print(7);
                    case 't', 'u', 'v' -> System.out.print(8);
                    case 'w', 'x', 'y', 'z' -> System.out.print(9);
                    case '#' -> System.out.print('#');
                    case '*' -> System.out.print('*');
                    case ' ' -> System.out.print('0');
                    default -> System.out.print(1);
                }
            }
        } else {
            System.out.print("It is no a string :(");
        }
    }
}
