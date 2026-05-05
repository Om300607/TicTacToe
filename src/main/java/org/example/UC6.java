package org.example;

public class UC6 {
    public static void main(String[] args) {
        // Example 3x3 board initialized with '-'
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Example move: row=1, col=1, symbol='X'
        updateBoard(board, 1, 1, 'X');

        // Display updated board
        printBoard(board);
    }

    // Method to update the board with the given symbol
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
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
