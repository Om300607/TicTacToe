package Level2;

import java.util.Scanner;

public class L3 {
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

    public static String[] splitWords(String s) {
        int len = getLength(s);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') spaceCount++;
        int[] spaces = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') spaces[idx++] = i;
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            words[i] = s.substring(start, spaces[i]);
            start = spaces[i] + 1;
        }
        words[spaceCount] = s.substring(start, len);
        return words;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = wordWithLength(words);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
