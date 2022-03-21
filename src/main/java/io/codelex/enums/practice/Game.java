package io.codelex.enums.practice;

import java.util.Scanner;

public class Game {
    private static int playerWins = 0;
    private static int aiWins = 0;

    private static scissorPaperStone randomAiHand() {
        return scissorPaperStone.getRandomHand();
    }

    public static void main(String[] args) {
        System.out.println(scissorPaperStone.getRandomHand());
        System.out.println("Let's play !");
        System.out.println("Scissor Paper Stone!");
        playerTurn();

    }

    public static void playerTurn() {
        System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit):");
        if (playerHand() == randomAiHand()) {
            System.out.println("TIE");
        } else if (playerHand() == scissorPaperStone.PAPER) {
            if (randomAiHand() == scissorPaperStone.SCISSOR) {
                System.out.println("Scissor cuts paper, I won!");
                aiWins++;
            } else if (randomAiHand() == scissorPaperStone.STONE) {
                System.out.println("You won!");
                playerWins++;
            }
        } else if (playerHand() == scissorPaperStone.STONE) {
            if (randomAiHand() == scissorPaperStone.PAPER) {
                System.out.println("Paper eats stone, I won!");
                aiWins++;
            } else if (randomAiHand() == scissorPaperStone.SCISSOR) {
                System.out.println("You won!");
                playerWins++;
            }
        } else if (playerHand() == scissorPaperStone.SCISSOR) {
            if (randomAiHand() == scissorPaperStone.STONE) {
                System.out.println("Stone breaks scissor, I won!");
                aiWins++;
            } else if (randomAiHand() == scissorPaperStone.PAPER) {
                System.out.println("You won!");
                playerWins++;
            }
        }
    }

    public static scissorPaperStone playerHand() {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        if (key.equalsIgnoreCase("s")) {
            return scissorPaperStone.SCISSOR;
        } else if (key.equalsIgnoreCase("p")) {
            return scissorPaperStone.PAPER;
        } else if (key.equalsIgnoreCase("t")) {
            return scissorPaperStone.STONE;
        }
        return scissorPaperStone.PAPER;
    }
}
