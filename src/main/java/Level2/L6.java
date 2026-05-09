package Level2;

import java.util.Scanner;

public class L6 {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classify(String s) {
        String[][] result=new String[s.length()][2];
        for (int i=0;i<s.length();i++) {
            result[i][0]=String.valueOf(s.charAt(i));
            result[i][1]=checkChar(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[][] table=classify(text);
        System.out.println("Char\tType");
        for (String[] row:table) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
}
