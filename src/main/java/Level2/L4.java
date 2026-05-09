package Level2;

import java.util.Scanner;

public class L4 {
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

    public static int[] shortestLongest(String[][] table) {
        int min = Integer.parseInt(table[0][1]);
        int max = min;
        for (String[] row : table) {
            int len = Integer.parseInt(row[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = wordWithLength(words);
        int[] result = shortestLongest(table);
        System.out.println("Shortest length: " + result[0]);
        System.out.println("Longest length: " + result[1]);
    }
}

