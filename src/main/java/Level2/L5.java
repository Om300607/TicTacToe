package Level2;

import java.util.Scanner;

public class L5 {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVC(String s) {
        int v=0,c=0;
        for (int i=0;i<s.length();i++) {
            String type=checkChar(s.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v,c};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int[] result=countVC(text);
        System.out.println("Vowels: "+result[0]);
        System.out.println("Consonants: "+result[1]);
    }
}
