package org.example;

import java.util.Random;

public class UC7 {
    public static void main(String[] args) {
        // Example 3x3 board initialized with '-'
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Computer symbol
        char computerSymbol = 'O';

        // Computer makes a random valid move
        makeComputerMove(board, computerSymbol);

        // Display updated board
        printBoard(board);
    }

    // Method for computer to make a random valid move
    public static void makeComputerMove(char[][] board, char symbol) {
        Random random = new Random();
        int slot, row, col;

        while (true) {
            // Generate random slot between 1 and 9
            slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Validate move
            if (board[row][col] == '-') {
                board[row][col] = symbol; // Place symbol
                System.out.println("Computer chose slot " + slot + " → (" + row + "," + col + ")");
                break;
            }
        }
    }

    // Utility method to print the board
    public static void printBoard(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
