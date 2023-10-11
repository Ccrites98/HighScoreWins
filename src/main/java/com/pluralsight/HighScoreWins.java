package com.pluralsight;
import java.util.*;



public class HighScoreWins {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        //Greet and ask for info
        System.out.print("Please input the game score: ");
        String Score = keyBoard.next();
        //Start the splits
        String[] XScore = Score.split("\\|");
        System.out.println(Arrays.toString(XScore));

        String[] team = XScore[0].split(":");
        String[] team_score = XScore[1].split(":");

        int home_score = Integer.parseInt(team_score[0]);
        int visitor_score = Integer.parseInt(team_score[1]);
        //Ref give the scores
        if (home_score > visitor_score) {
            System.out.println("winner : Home");

        } else {
            System.out.println("winner : Visitor");
            //Ivan is actual goat, he explained this super well to me.
            //Literally was struggling, ivan swept in and saved this code.
        }
    }
    }

