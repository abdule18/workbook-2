package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {

    private static Vehicle[] car = new Vehicle[20];
    private static int carCount = 6;
    private static Scanner scanner = new Scanner(System.in);
    private static Vehicle[] cars = getAPopulatedVihicle();

    public static void main(String[] args) {
        loopForPromptingUser();
    }

    private static void loopForPromptingUser(){

        System.out.println("What do you wnat to do?");
        String userPrompt = "1 - List all vehicles\n" +
                "2 - Search by make/model\n" +
                "3 - Search by price range\n" +
                "4 - Search by color\n" +
                "5 - Add a vehicle\n" +
                "6 - Quit\n" +
                "Enter your command: ";

        int userInput;

        do {
            System.out.print(userPrompt);
            userInput = scanner.nextInt();
            scanner.nextLine();

            if (userInput == 1) {
                listAllVehicle();
            } else if (userInput == 2){
                searchByMakeModel();
            }  else if (userInput == 3){
                searchByPriceRange();
            } else if (userInput == 4){
                searchByColor();
            }  else if (userInput == 5){
                addVehicle();
            }

        } while (userInput != 6);
    }

    private static void addVehicle(){
        System.out.print("Add a vehicle (vehicleId, make/model, color, odometer, price): ");
                String newVehicle = scanner.nextLine();

                String[] makeNewVehicle = newVehicle.split(Pattern.quote(","));

                long id = Long.parseLong(makeNewVehicle[0].trim());
                String make = makeNewVehicle[1].trim();
                String color = makeNewVehicle[2].trim();
                int odometer = Integer.parseInt(makeNewVehicle[3].trim());
                float price = Float.parseFloat(makeNewVehicle[4].trim());

                if (carCount < car.length){
                    car[carCount] = new Vehicle(id, make, color, odometer, price);
                    carCount++;
                    System.out.println("Vehicle added successfully!");
                } else {
                    System.out.println("Sorry, the car list is full.");
                }



    }

    private static void listAllVehicle(){
        for (Vehicle vehicle : cars) {
            if(vehicle != null){
                System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
            }
        }
    }

    private static void searchByMakeModel(){
        System.out.println("Name the car by make/model: ");
        String userSearch = scanner.nextLine();

        for (Vehicle vehicle : cars) {
            if (vehicle != null){

                if (userSearch.equalsIgnoreCase(vehicle.getMakeModel())){
                    System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                }
            }
        }
    }

    private static void searchByColor(){
        System.out.print("Enter the color of the car: ");
        String userSearch = scanner.nextLine();

        for (Vehicle vehicle : cars) {
            if (vehicle != null){

                if (userSearch.equalsIgnoreCase(vehicle.getColor())){
                    System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                }
            }
        }
    }

    private static void searchByPriceRange(){
        System.out.print("Enter the price of the car: ");
                float userSearch = scanner.nextFloat();

                for (Vehicle vehicle : cars) {
                    if (vehicle != null){

                        if (userSearch == vehicle.getPrice()){
                            System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                        }
                    }
                }
    }

    private static Vehicle[] getAPopulatedVihicle(){

        car[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        car[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        car[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        car[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        car[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        car[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        return car;
    }

}