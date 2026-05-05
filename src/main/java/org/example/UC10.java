package org.example;

public class UC10 {
    public static void main(String[] args) {
        // Example board completely filled with no winner
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'O', 'X', 'O'}
        };

        if (isDraw(board)) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Moves still available.");
        }
    }

    // Method to check if the game is a draw
    public static boolean isDraw(char[][] board) {
        // Traverse the board
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false; // Found an empty cell → not a draw
                }
            }
        }
        // No empty cells → draw
        return true;
    }
}
