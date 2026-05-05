package org.example;

public class UC5 {
    public static void main(String[] args) {
        // Example 3x3 board initialized with '-'
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Example move: row=1, col=1
        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            board[row][col] = 'X'; // Place symbol if valid
            System.out.println("Move accepted at (" + row + "," + col + ")");
        } else {
            System.out.println("Invalid move at (" + row + "," + col + ")");
        }
    }

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        // Boundary check: row and col must be between 0 and 2
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        // Cell must be empty
        return board[row][col] == '-';
    }
}
