package io.codelex.enums.practice;

import java.util.Scanner;

public class CardinalPointsTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CardinalPoints n = CardinalPoints.valueOf(keyboard.next().toUpperCase());

        switch (n) {
            case EAST -> System.out.println(CardinalPoints.EAST + ":right:" + CardinalPoints.EAST.ordinal());
            case WEST -> System.out.println(CardinalPoints.WEST + ":left:" + CardinalPoints.WEST.ordinal());
            case NORTH -> System.out.println(CardinalPoints.NORTH + ":up:" + CardinalPoints.NORTH.ordinal());
            case SOUTH -> System.out.println(CardinalPoints.SOUTH + ":down:" + CardinalPoints.SOUTH.ordinal());
        }
    }
}