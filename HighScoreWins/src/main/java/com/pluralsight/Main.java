package com.pluralsight;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String userPrompt = scanner.nextLine();

        String[] piping = userPrompt.split(Pattern.quote("|"));

        String home = piping[0];
        String home1 = piping[1];

        String[] colon = home.split(Pattern.quote(":"));
        String[] colon1 = home1.split(Pattern.quote(":"));
        String visit = colon[0];
        String visit1 = colon[1];
        int visit2 = Integer.parseInt(colon1[0]);
        int visit3 = Integer.parseInt(colon1[1]);


        if (visit2 > visit3){
            System.out.println("Winner: " + visit);
        }  else {
            System.out.println("Winner: " + visit1);
        }



//        String input = "111|Hot Chocolate (12-count)|21|4.99";
//        String[] tokens = input.split(Pattern.quote("|"));
//        int id = Integer.parseInt(tokens[0]);
//        String name = tokens[1];
//        int quantity = Integer.parseInt(tokens[2]);
//        double price = Double.parseDouble(tokens[3]);
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(quantity);
//        System.out.println(price);
    }
}