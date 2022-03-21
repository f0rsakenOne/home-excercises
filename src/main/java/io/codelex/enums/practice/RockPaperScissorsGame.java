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

    public static void gameCycle() {
        while ( !quitGame ) {
            System.out.println("Rock Paper Scissors!");
            getPlayerMove();
            getAiMove();
            getResult();
        }
    }

    public static void endResults() {
        System.out.println("Number of trials : " + trials);
        System.out.printf("I won %d(%.2f%%)%n", aiWins, ((float) aiWins / (float) trials * 100f));
        System.out.printf("You won %d(%.2f%%)%n", playerWins, ((float) playerWins / (float) trials * 100f));
    }

    public static void getPlayerMove() {
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

    public static void getAiMove() {
        aiHand = RPS.getRandomHand();
        System.out.println("\tMy turn : " + aiHand);
    }

    public static void getResult() {
        if (aiHand == playerHand) {
            System.out.println("\tIt's a tie.");
            trials++;
        } else {
            if (playerHand == RPS.ROCK) {
                if (aiHand == RPS.SCISSOR) {
                    System.out.println("\tYou won!");
                    playerWins++;
                    trials++;
                } else if (aiHand == RPS.PAPER) {
                    System.out.println("\tPaper eats rock, I won!");
                    aiWins++;
                    trials++;
                }
            } else if (playerHand == RPS.SCISSOR) {
                if (aiHand == RPS.PAPER) {
                    System.out.println("\tYou won!");
                    playerWins++;
                    trials++;
                } else if (aiHand == RPS.ROCK) {
                    System.out.println("\tRock breaks scissor, I won!");
                    aiWins++;
                    trials++;
                }
            } else if (playerHand == RPS.PAPER) {
                if (aiHand == RPS.ROCK) {
                    System.out.println("\tYou won!");
                    playerWins++;
                    trials++;
                } else if (aiHand == RPS.SCISSOR) {
                    System.out.println("\tScissor cuts paper, I won!");
                    aiWins++;
                    trials++;
                }
            }
        }
    }

}