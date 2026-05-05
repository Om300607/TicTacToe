package org.example;

public class UC4 {
    public static void main(String[] args) {
        int slot = 7; // Example slot entered by user
        int[] indices = convertSlotToIndices(slot);

        System.out.println("Slot " + slot + " maps to:");
        System.out.println("Row: " + indices[0] + ", Column: " + indices[1]);
    }

    // Utility method to convert slot number into row & column
    public static int[] convertSlotToIndices(int slot) {
        // Zero-based indexing: slot 1 maps to (0,0), slot 9 maps to (2,2)
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }
}
