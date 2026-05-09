package Level2;

import java.util.Scanner;

public class L9 {
    public static String computerChoice() {
        int n=(int)(Math.random()*3);
        if (n==0) return "rock";
        else if (n==1) return "paper";
        else return "scissors";
    }

    public static String winner(String user,String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock")&&comp.equals("scissors")) return "user";
        if (user.equals("rock")&&comp.equals("paper")) return "computer";
        if (user.equals("paper")&&comp.equals("rock")) return "user";
        if (user.equals("paper")&&comp.equals("scissors")) return "computer";
        if (user.equals("scissors")&&comp.equals("paper")) return "user";
        if (user.equals("scissors")&&comp.equals("rock")) return "computer";
        return "draw";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of games: ");
        int games=sc.nextInt();
        int userWins=0,compWins=0;
        for (int i=0;i<games;i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user=sc.next();
            String comp=computerChoice();
            String win=winner(user,comp);
            if (win.equals("user")) userWins++;
            else if (win.equals("computer")) compWins++;
            System.out.println("User: "+user+" | Computer: "+comp+" | Winner: "+win);
        }
        System.out.println("User Wins: "+userWins+" | Computer Wins: "+compWins);
        System.out.println("User %: "+(userWins*100.0/games));
        System.out.println("Computer %: "+(compWins*100.0/games));
    }
}
