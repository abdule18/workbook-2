package com.pluralsight;


import java.util.Scanner;

public class Main {

    Person thePerson = new Person(fullName, age, profession);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        int age;
        String profession;

        System.out.print("What is the person's full name? ");
        fullName = scanner.nextLine();

        System.out.print("What is the person's age? ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is the person's profession: ");
        profession = scanner.nextLine();

        System.out.print("What is the person's full name? ");
        fullName = scanner.nextLine();

        System.out.print("What is the person's age? ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is the person's profession: ");
        profession = scanner.nextLine();

        Person theOtherPerson = new Person(fullName, age, profession);

        System.out.printf("Person %s is a %s and is %d years old.", thePerson.getFullName(), thePerson.getProfession(), thePerson.getAge());
        System.out.println(theOtherPerson.getFullName());
        displayPerson(thePerson);

    }

    public static void displayPerson(String fullName, int age, String profession){
        System.out.printf("Person %s is a %s and is %d years old.", thePerson.getFullName(), thePerson.getProfession(), thePerson.getAge());
    }
}