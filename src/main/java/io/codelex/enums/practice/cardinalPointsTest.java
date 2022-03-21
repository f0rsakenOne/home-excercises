package io.codelex.enums.practice;

import java.util.Scanner;

public class cardinalPointsTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        cardinalPoints n = cardinalPoints.valueOf(keyboard.next().toUpperCase());

        switch (n) {
            case EAST -> System.out.println(cardinalPoints.EAST + ":right:" + cardinalPoints.EAST.ordinal());
            case WEST -> System.out.println(cardinalPoints.WEST + ":left:" + cardinalPoints.WEST.ordinal());
            case NORTH -> System.out.println(cardinalPoints.NORTH + ":up:" + cardinalPoints.NORTH.ordinal());
            case SOUTH -> System.out.println(cardinalPoints.SOUTH + ":down:" + cardinalPoints.SOUTH.ordinal());
        }
    }
}
