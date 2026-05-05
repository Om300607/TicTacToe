package org.example;

import java.util.Scanner;

public class UC3 {
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("You selected slot: " + slot);
    }

    // Method to read and return slot number
    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            slot = scanner.nextInt();

            if (slot >= 1 && slot <= 9) {
                break; // valid input
            } else {
                System.out.println("Invalid slot! Please enter a number between 1 and 9.");
            }
        }

        return slot;
    }
}
