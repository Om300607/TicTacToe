package Level2;

import java.util.Scanner;

public class L2 {
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

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] userSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");
        System.out.println("Comparison result: " + compareArrays(userSplit, builtInSplit));
    }
}

