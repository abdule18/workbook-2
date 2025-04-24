package com.pluralsight;
import java.util.Scanner;
public class Main {

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
                for (Vehicle vehicle : cars) {
                    if(vehicle != null){
                        System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                    }
                }
            } else if (userInput == 2){
                System.out.println("Name the car by make/model: ");
                String userSearch = scanner.nextLine();

                for (Vehicle vehicle : cars) {
                    if (vehicle != null){

                        if (userSearch.equalsIgnoreCase(vehicle.getMakeModel())){
                            System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                        }
                    }
                }
            }  else if (userInput == 3){
                System.out.print("Enter the price of the car: ");
                float userSearch = scanner.nextFloat();

                for (Vehicle vehicle : cars) {
                    if (vehicle != null){

                        if (userSearch == vehicle.getPrice()){
                            System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                        }
                    }
                }
            } else if (userInput == 4){
                System.out.print("Enter the color of the car: ");
                String userSearch = scanner.nextLine();

                for (Vehicle vehicle : cars) {
                    if (vehicle != null){

                        if (userSearch.equalsIgnoreCase(vehicle.getColor())){
                            System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                        }
                    }
                }
            }  else if (userInput == 5){
                System.out.print("Add a vehicle: ");
                String userSearch = scanner.nextLine();

                for (Vehicle vehicle : cars) {
                    if (vehicle != null){

                        if (userSearch.equalsIgnoreCase(vehicle.getColor())){
                            System.out.println(vehicle.getVehicleId() + ", " + vehicle.getMakeModel() + ", " + vehicle.getColor() + ", " + vehicle.getOdometerReading() + ", " + vehicle.getPrice() + ".");
                        }
                    }
                }
            }

        } while (userInput != 6);
    }

//    private static Vehicle getCarById(Vehicle[] cars, int id){
//        for (Vehicle vehicle : cars){
//            if(vehicle.getVehicleId() == id){
//                return vehicle;
//            }
//        }
//        return null;
//    }
//    private static Vehicle getCarByModel(Vehicle[] cars, String model){
//        for (Vehicle vehicle : cars){
//            if(vehicle.getMakeModel().equalsIgnoreCase(model)){
//                return vehicle;
//            }
//        }
//        return null;
//    }
//    private static Vehicle getCarByColor(Vehicle[] cars, String color){
//        for (Vehicle vehicle : cars){
//            if(vehicle.getColor().equalsIgnoreCase(color)){
//                return vehicle;
//            }
//        }
//        return null;
//    }
//    private static Vehicle getCarByOdometerReading(Vehicle[] cars, int odometer){
//        for (Vehicle vehicle : cars){
//            if(vehicle.getOdometerReading() == odometer){
//                return vehicle;
//            }
//        }
//        return null;
//    }
//    private static Vehicle getCarByPrice(Vehicle[] cars, float pricing){
//        for (Vehicle vehicle : cars){
//            if(vehicle.getPrice() == pricing){
//                return vehicle;
//            }
//        }
//        return null;
//    }


    private static Vehicle[] getAPopulatedVihicle(){
        Vehicle[] car = new Vehicle[20];

        car[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        car[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        car[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        car[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        car[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        car[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        return car;
    }

}