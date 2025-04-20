package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.print("Full name: ");
        String name = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        int billingZip = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        int shippingZip = scanner.nextInt();
        scanner.nextLine();

        StringBuilder billingAdress = new StringBuilder();
        billingAdress.append("Billing Address:\n");
        billingAdress.append(billingStreet + "\n");
        billingAdress.append(billingCity + ", ");
        billingAdress.append(billingState + " ");
        billingAdress.append(billingZip + "\n");
        billingAdress.append("\n");

        StringBuilder shippingAdress = new StringBuilder();
        billingAdress.append("Shipping Address:\n");
        billingAdress.append(shippingStreet + "\n");
        billingAdress.append(shippingCity + ", ");
        billingAdress.append(shippingState + " ");
        billingAdress.append(shippingZip);

        System.out.println();
        System.out.println(name);
        System.out.println();
        System.out.println(billingAdress.toString());
        System.out.print(shippingAdress.toString());

    }
}