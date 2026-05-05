package org.example;

public class UC9 {
    public static void main(String[] args) {
        // Example board with a winning condition for 'X'
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', '-', 'O'},
                {'-', '-', '-'}
        };

        if (checkWin(board, 'X')) {
            System.out.println("Player X has won!");
        } else if (checkWin(board, 'O')) {
            System.out.println("Player O has won!");
        } else {
            System.out.println("No winner yet.");
        }
    }

    // Method to check if a player has won
    public static boolean checkWin(char[][] board, char symbol) {
        // Check rows
        for (int r = 0; r < 3; r++) {
            if (board[r][0] == symbol && board[r][1] == symbol && board[r][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int c = 0; c < 3; c++) {
            if (board[0][c] == symbol && board[1][c] == symbol && board[2][c] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }
}
