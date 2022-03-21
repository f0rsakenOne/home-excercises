package io.codelex.enums.practice;

import java.util.Random;

public enum scissorPaperStone {
    SCISSOR,
    PAPER,
    STONE;

    public static scissorPaperStone getRandomHand() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
