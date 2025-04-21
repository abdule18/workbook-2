package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What date will you be coming? (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine();

        System.out.print("How many ticket would you like? ");
        int tickets = scanner.nextInt();

        int spacePosition = name.indexOf(" ");
        String firstName = name.substring(0, spacePosition);
        String lastName = name.substring(spacePosition + 1);


        name = lastName + ", "  + firstName;


        String[] date = dateInput.split("\\/");

        String month = date[0];
        String day = date[1];
        String year = date[2];

        String finalDate = year + "-" + month + "-" + day;



        System.out.printf("%d ticket reserved for %s under %s", tickets, finalDate, name);


    }
}