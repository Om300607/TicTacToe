package Level2;

import java.util.Random;

public class L8 {
    public static int[] generateAges(int n) {
        Random r=new Random();
        int[] ages=new int[n];
        for (int i=0;i<n;i++) ages[i]=10+r.nextInt(90);
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result=new String[ages.length][2];
        for (int i=0;i<ages.length;i++) {
            result[i][0]=String.valueOf(ages[i]);
            if (ages[i]<0) result[i][1]="false";
            else if (ages[i]>=18) result[i][1]="true";
            else result[i][1]="false";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ages=generateAges(10);
        String[][] table=canVote(ages);
        System.out.println("Age\tCanVote");
        for (String[] row:table) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
}

