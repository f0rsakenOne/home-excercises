package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char turn = 'X';

    public static void main(String[] args) {
        initBoard();
        while ( !checkWin() && !checkTie() ) {
            displayBoard();
            changeTiles();
            getTurn();
        }
        displayBoard();
        if (checkWin()) {
            getTurn();
            System.out.println(turn + " has won! Congratulations!");
        } else {
            System.out.println("The game is a tie.");
        }
    }

    private static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    private static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    private static void changeTiles() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(turn + " , choose your location (row, column): ");
        int r = Integer.parseInt(keyboard.next());
        int c = Integer.parseInt(keyboard.next());
        if (board[r][c] == ' ') {
            board[r][c] = turn;
        } else {
            System.out.println("Illegal move");
            getTurn(); // ātrais fix, lai nemainītu turn uz citu
        }
    }

    private static void getTurn() {
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';
        }
    }


    private static boolean checkTie() {
        int xLength = 0;
        int oLength = 0;
        for (char[] row : board) {
            for (char tile : row) {
                if (tile == 'X') {
                    xLength++;
                }
                if (tile == 'O') {
                    oLength++;
                }
            }
        }
        return xLength + oLength == 9;
    }

    private static boolean checkWin() {
        return checkHorizontalWin() || checkVerticalWin() || checkDiagonalWin();
    }

    private static boolean checkHorizontalWin() {
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' ') {
            return true;
        } else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != ' ') {
            return true;
        } else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' ') {
            return true;
        }
        return false;
    }

    private static boolean checkVerticalWin() {
        if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' ') {
            return true;
        } else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' ') {
            return true;
        } else if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != ' ') {
            return true;
        }
        return false;
    }

    private static boolean checkDiagonalWin() {
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
            return true;
        } else if (board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != ' ') {
            return true;
        }
        return false;
    }

}