package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Theater! To make a reservation, I will need" +
                " you to fill out this form for ticket reservations.");

        System.out.println("Please enter your first and last name: ");
        String name = scanner.nextLine().trim();

        int spaceBetweenName = name.indexOf(" ");
        String firstName = name.substring(0, spaceBetweenName);
        String lastName = name.substring(spaceBetweenName + 1);

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine();

        DateTimeFormatter dateFormatter;
        dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date = LocalDate.parse(dateInput, dateFormatter);

        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        if(tickets == 1) {
            System.out.printf("1 ticket reserved for %s under %s, %s", date, lastName, firstName);
        } else {
            System.out.printf("%d tickets reserved for %s under %s, %s", tickets, date, lastName, firstName);
        }
    }
}
