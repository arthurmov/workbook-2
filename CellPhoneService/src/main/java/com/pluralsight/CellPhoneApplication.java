package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        //known values
        System.out.println("What is the serial number?");
        serialNumber = scanner.nextInt();

        System.out.println("What model is the phone?");
        model = scanner.nextLine();

        System.out.println("Who is the carrier?");
        carrier = scanner.nextLine();

        System.out.println("What is the phone number?");
        phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?");
        owner = scanner.nextLine();

        scanner.nextLine(); //clear CRLF

        CellPhone newCellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        System.out.println("The serial number is: " + newCellPhone.getSerialNumber());
        System.out.println("The model is: " +newCellPhone.getModel());
        System.out.println("The carrier is: " +newCellPhone.getCarrier());
        System.out.println("The phone number is: " +newCellPhone.getPhoneNumber());
        System.out.println("The owner is: " +newCellPhone.getOwner());
    }
}
