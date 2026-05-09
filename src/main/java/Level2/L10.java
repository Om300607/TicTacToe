package Level2;

import java.util.Random;

public class L10 {
    public static int[][] generateScores(int n) {
        Random r=new Random();
        int[][] scores=new int[n][3];
        for (int i=0;i<n;i++) {
            scores[i][0]=10+r.nextInt(90);
            scores[i][1]=10+r.nextInt(90);
            scores[i][2]=10+r.nextInt(90);
        }
        return scores;
    }

    public static double[][] calculate(int[][] scores) {
        double[][] result=new double[scores.length][3];
        for (int i=0;i<scores.length;i++) {
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double perc=Math.round((total/300.0*100)*100.0)/100.0;
            result[i][0]=total;
            result[i][1]=avg;
            result[i][2]=perc;
        }
        return result;
    }

    public static String grade(double perc) {
        if (perc>=90) return "A";
        else if (perc>=75) return "B";
        else if (perc>=60) return "C";
        else if (perc>=40) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        int[][] scores=generateScores(5);
        double[][] calc=calculate(scores);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i=0;i<scores.length;i++) {
            System.out.print(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t");
            System.out.print((int)calc[i][0]+"\t");
            System.out.print(String.format("%.2f",calc[i][1])+"\t");
            System.out.print(String.format("%.2f",calc[i][2])+"\t");
            System.out.println(grade(calc[i][2]));
        }
    }
}
