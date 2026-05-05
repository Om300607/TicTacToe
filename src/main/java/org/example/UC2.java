package org.example;

import java.util.Random;

public class UC2 {
    public static void main(String[] args) {
        Random random = new Random();
        int tossResult = random.nextInt(2);

        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        if (tossResult == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Result: " + tossResult);
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer + " starts the game!");
    }
}

