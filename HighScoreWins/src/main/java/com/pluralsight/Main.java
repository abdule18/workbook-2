package com.pluralsight;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String userPrompt = scanner.nextLine();

        String[] piping = userPrompt.split(Pattern.quote("|"));

        String teamNamesString = piping[0]; //this would be home:visitor
        String scoresString = piping[1]; //this would be  55:23

        String[] teamNamesArray = teamNamesString.split(Pattern.quote(":"));

        String[] scoresArray = scoresString.split(Pattern.quote(":"));

        String homeTeamName = teamNamesArray[0];
        String visitorTeamName = teamNamesArray[1];

        int homeTeamScore = Integer.parseInt(scoresArray[0]);
        int visitorTeamScore = Integer.parseInt(scoresArray[1]);


        if (homeTeamScore > visitorTeamScore){
            System.out.println("Winner: " + homeTeamName);
        }  else if (homeTeamScore == visitorTeamScore){
            System.out.println("It's a Draw");
        } else {
            System.out.println("Winner: " + visitorTeamName);
        }







        //        String home = piping[0];
//        String home1 = piping[1];
//
//        String[] colon = home.split(Pattern.quote(":"));
//        String[] colon1 = home1.split(Pattern.quote(":"));
//        String visit = colon[0];
//        String visit1 = colon[1];
//        int visit2 = Integer.parseInt(colon1[0]);
//        int visit3 = Integer.parseInt(colon1[1]);
//
//
//        if (visit2 > visit3){
//            System.out.println("Winner: " + visit);
//        }  else {
//            System.out.println("Winner: " + visit1);
//        }
    }
}