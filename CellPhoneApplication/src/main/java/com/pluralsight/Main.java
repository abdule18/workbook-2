package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(Integer.parseInt((scanner.nextLine())));

        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setGetOwner(scanner.nextLine());

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());


    }
}