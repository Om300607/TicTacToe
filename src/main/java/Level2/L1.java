package Level2;

import java.util.Scanner;

public class L1 {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("User-defined length: " + getLength(input));
        System.out.println("Built-in length: " + input.length());
    }
}
