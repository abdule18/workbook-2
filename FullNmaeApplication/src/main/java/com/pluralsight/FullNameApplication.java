package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name");

        System.out.print("First name: ");
        String firstname = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String lastname = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String middlename = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String test = "";

        String fullname = "";


        if (middlename.isBlank()){
            fullname = firstname + " " + lastname;
        } else {
            fullname = firstname + " " + middlename + " " + lastname;
        }

        if(!suffix.isBlank()){
            fullname +=  ", " + suffix;
        }

        System.out.println("Full name: " + fullname);
    }
}