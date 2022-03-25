package io.codelex.enums.practice;

import java.util.Scanner;

public class RockPaperScissorsGame {
    private static int playerWins = 0;
    private static int aiWins = 0;
    private static int trials = 0;

    public static void main(String[] args) {
        System.out.println("Let's play !");
        gameCycle();
        endResults();
        System.out.println("Bye!");
    }

    private static void gameCycle() {
        while ( true ) {
            System.out.println("Rock Paper Scissors!");
            RPS playerHand = getPlayerMove();
            if (playerHand == null) {
                break;
            }
            RPS aiHand = getAiMove();
            System.out.println("\tMy turn : " + aiHand);
            checkWin(playerHand, aiHand);
        }
    }

    private static void endResults() {
        System.out.println("Number of trials : " + trials);
        System.out.printf("I won %d(%.2f%%)%n", aiWins, ((float) aiWins / (float) trials * 100f));
        System.out.printf("You won %d(%.2f%%)%n", playerWins, ((float) playerWins / (float) trials * 100f));
    }

    private static RPS getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tYour turn (Enter s for scissors, p for paper, r for rock, q to quit):");
        String key = scanner.nextLine();

        switch (key.toLowerCase()) {
            case "s" -> {
                return RPS.SCISSOR;
            }
            case "p" -> {
                return RPS.PAPER;
            }
            case "r" -> {
                return RPS.ROCK;
            }
            case "q" -> {
                return null;
            }
            default -> {
                System.out.println("Invalid input... try again");
                return getPlayerMove();
            }
        }
    }

    private static RPS getAiMove() {
        return RPS.getRandomHand();
    }

    private static void checkWin(RPS playerHand, RPS aiHand) {
        if (aiHand == playerHand) {
            System.out.println("\tIt's a tie.");
        } else if (isPlayerWin(playerHand, aiHand)) {
            System.out.println("\tYou won!");
            playerWins++;
        } else if (isAiWin(playerHand, aiHand)) {
            switch (aiHand) {
                case PAPER -> System.out.println("\tPaper eats rock, I won!");
                case SCISSOR -> System.out.println("\tScissor cuts paper, I won!");
                case ROCK -> System.out.println("\tRock breaks scissor, I won!");
            }
            aiWins++;
        }
        trials++;
    }

    private static boolean isPlayerWin(RPS playerHand, RPS aiHand) {
        return playerHand == RPS.ROCK && aiHand == RPS.SCISSOR ||
                playerHand == RPS.SCISSOR && aiHand == RPS.PAPER ||
                playerHand == RPS.PAPER && aiHand == RPS.ROCK;
    }

    private static boolean isAiWin(RPS playerHand, RPS aiHand) {
        return playerHand == RPS.ROCK && aiHand == RPS.PAPER ||
                playerHand == RPS.SCISSOR && aiHand == RPS.ROCK ||
                playerHand == RPS.PAPER && aiHand == RPS.SCISSOR;
    }
}