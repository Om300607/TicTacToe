package Level1;

import java.util.*;
public class L10 {
    static String manualLower(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z') res+=(char)(c+32);
            else res+=c;
        }
        return res;
    }
    static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String manual=manualLower(s);
        String built=s.toLowerCase();
        System.out.println(compareStrings(manual,built));
    }
}
