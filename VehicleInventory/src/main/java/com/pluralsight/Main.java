package com.pluralsight;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Vehicle[] vehicles = getPopulatedVehicles();

    public static void main(String[] args) {

        int command;
        do {
            System.out.println("\nWhat do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");

            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    System.out.println("\nListing all vehicles...\n");
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel();
                    break;
                case 3:
                    findVehiclesByPrice();
                    break;
                case 4:
                    findVehiclesByColor();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Entry! Try Again.");
            }
        } while (command != 6);
    }

    private static void listAllVehicles() {

        for(int i = 0; i < vehicles.length; i++) {
            if(vehicles[i] != null) {
                System.out.println("\nVehicle ID: " + vehicles[i].getVehicleId());
                System.out.println("Make/Model: " + vehicles[i].getMakeModel());
                System.out.println("Color: " + vehicles[i].getColor());
                System.out.println("Odometer Reading: " + vehicles[i].getOdometerReading());
                System.out.println("Price: " + vehicles[i].getPrice());
            } else {
                break;
            }
        }
    }

    public static void findVehiclesByMakeModel() {
        String userInput;

        System.out.println("Enter the Make/Model that you're searching for: ");
        userInput = scanner.nextLine();

        for(int i = 0; i < vehicles.length; i++) {

            if(vehicles[i] != null && userInput.equalsIgnoreCase(vehicles[i].getMakeModel())) {
                System.out.println("\nThe Vehicle you're searching for is: ");
                System.out.println("\nVehicle ID: " + vehicles[i].getVehicleId());
                System.out.println("Make/Model: " + vehicles[i].getMakeModel());
                System.out.println("Color: " + vehicles[i].getColor());
                System.out.println("Odometer Reading: " + vehicles[i].getOdometerReading());
                System.out.println("Price: " + vehicles[i].getPrice());
            }
        }
    }

    public static void findVehiclesByPrice() {

    }

    public static void findVehiclesByColor() {

    }

    public static void addAVehicle() {
        System.out.println("\nYou selected 'Add A Vehicle'.");

        System.out.println("Enter the Vehicle ID: ");
        long newId = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Enter the Make/Model: ");
        String newMakeModel = scanner.nextLine();

        System.out.println("Enter the Color: ");
        String newColor = scanner.nextLine();

        System.out.println("Enter the Odometer Reading: ");
        int newOdometerReading = scanner.nextInt();

        System.out.println("Enter the Price: ");
        float newPrice = scanner.nextFloat();

        scanner.nextLine();
        
        Vehicle newVehicle = new Vehicle(newId, newMakeModel, newColor, newOdometerReading, newPrice);

        for(int i = 0; i < vehicles.length; i++) {
            if(vehicles[i] == null) {
                vehicles[i] = newVehicle;
            }
        }
    }

    public static Vehicle[] getPopulatedVehicles() {

        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        return vehicles;
    }
}