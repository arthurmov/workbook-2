package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //establish known values
        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine().trim();

        //split method
        String firstName = " ";
        String middleName = "none";
        String lastName = " ";

        String[] splits = name.split("\\ ");

        if (splits.length == 1) {
            firstName = splits[0];
        }
        else if (splits.length == 2) {
            firstName = splits[0];
            lastName = splits[1];
        }
        else if (splits.length == 3) {
            firstName = splits[0];
            middleName = splits[1];
            lastName = splits[2];
        }


//        //indexOf method
//
//        int firstSpaceIndex = name.indexOf(" ");
//
//        String firstName = name.substring(0, firstSpaceIndex);
//
//        int secondSpaceIndex = name.indexOf(" ", firstSpaceIndex + 1);
//
//        String middleName = "none";
//        String lastName = " ";
//
//        if(secondSpaceIndex >= 0) {
//            //we have a middle and last name
//            middleName = name.substring(firstSpaceIndex + 1, secondSpaceIndex);
//            lastName = name.substring(secondSpaceIndex + 1);
//        } else {
//            //we only have a last name
//            lastName = name.substring(firstSpaceIndex + 1);
//        }

        //display the results
        System.out.println();
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
