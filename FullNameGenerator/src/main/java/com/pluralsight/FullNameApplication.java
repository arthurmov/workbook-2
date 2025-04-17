package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get all known values
        System.out.println("Please enter your name: ");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: (Mr./Ms./Mrs.)");
        String suffix = scanner.nextLine().trim();


        //compute the unknown
        String fullName = "";

        //if statements that concatenate the fullName string with user input
        if(!firstName.isEmpty()) {
            fullName = fullName.concat(firstName);
        }
        if (!middleName.isEmpty()) {
            fullName = fullName.concat(" ").concat(middleName);
        }
        if (!lastName.isEmpty()) {
            fullName = fullName.concat(" ").concat(lastName);
        }
        if (!suffix.isEmpty()) {
            fullName = fullName.concat(", ").concat(suffix);
        }

        //prints the name
        System.out.println("Full name: " + fullName);
    }
}