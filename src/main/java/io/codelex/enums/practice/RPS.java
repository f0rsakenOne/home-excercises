package io.codelex.enums.practice;

import java.util.Random;

public enum RPS {
    SCISSOR,
    PAPER,
    ROCK;

    public static RPS getRandomHand() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}