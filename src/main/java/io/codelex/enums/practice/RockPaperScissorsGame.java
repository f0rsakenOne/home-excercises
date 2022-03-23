package io.codelex.enums.practice;

import java.util.Scanner;

public class RockPaperScissorsGame {
    private static int playerWins = 0;
    private static int aiWins = 0;
    private static int trials = 0;
    private static RPS playerHand;
    private static RPS aiHand;
    private static boolean quitGame = false;

    public static void main(String[] args) {
        System.out.println("Let's play !");
        gameCycle();
        endResults();
        System.out.println("Bye!");
    }

    private static void gameCycle() {
        while ( !quitGame ) {
            System.out.println("Rock Paper Scissors!");
            getPlayerMove();
            getAiMove();
            checkWin();
        }
    }

    private static void endResults() {
        System.out.println("Number of trials : " + (trials - 1));
        System.out.printf("I won %d(%.2f%%)%n", aiWins, ((float) aiWins / (float) (trials - 1) * 100f));
        System.out.printf("You won %d(%.2f%%)%n", playerWins, ((float) playerWins / (float) (trials - 1) * 100f));
    }

    private static void getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tYour turn (Enter s for scissors, p for paper, r for rock, q to quit):");
        String key = scanner.nextLine();

        switch (key.toLowerCase()) {
            case "s" -> playerHand = RPS.SCISSOR;
            case "p" -> playerHand = RPS.PAPER;
            case "r" -> playerHand = RPS.ROCK;
            case "q" -> quitGame = true;
            default -> {
                System.out.println("Invalid input... try again");
                getPlayerMove();
            }
        }
    }

    private static void getAiMove() {
        aiHand = RPS.getRandomHand();
        System.out.println("\tMy turn : " + aiHand);
    }

    private static void checkWin() {
        if (aiHand == playerHand) {
            System.out.println("\tIt's a tie.");
        } else if (isPlayerWin()) {
            System.out.println("\tYou won!");
            playerWins++;
        } else if (isAiWin()) {
            switch (aiHand) {
                case PAPER -> System.out.println("\tPaper eats rock, I won!");
                case SCISSOR -> System.out.println("\tScissor cuts paper, I won!");
                case ROCK -> System.out.println("\tRock breaks scissor, I won!");
            }
            aiWins++;
        }
        trials++;
    }

    private static boolean isPlayerWin() {
        return playerHand == RPS.ROCK && aiHand == RPS.SCISSOR ||
                playerHand == RPS.SCISSOR && aiHand == RPS.PAPER ||
                playerHand == RPS.PAPER && aiHand == RPS.ROCK;
    }

    private static boolean isAiWin() {
        return playerHand == RPS.ROCK && aiHand == RPS.PAPER ||
                playerHand == RPS.SCISSOR && aiHand == RPS.ROCK ||
                playerHand == RPS.PAPER && aiHand == RPS.SCISSOR;
    }
}