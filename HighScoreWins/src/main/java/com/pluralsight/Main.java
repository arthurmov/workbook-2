package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Establish known values
        System.out.println("Following this format: Home:Visitor|21:9\n" +
                "Please enter a game score: ");
        String gameScore = scanner.nextLine().trim();

        //gets of teams
        int teamColonIndex = gameScore.indexOf(':');
        String firstTeam = gameScore.substring(0, teamColonIndex);

        int verticalBarIndex = gameScore.indexOf("|");
        String secondTeam = gameScore.substring(teamColonIndex + 1, verticalBarIndex);

        //gets index of scores
        int scoreColonIndex = gameScore.indexOf(":", verticalBarIndex + 1);
        String firstScore = gameScore.substring(verticalBarIndex + 1, scoreColonIndex);
        String secondScore = gameScore.substring(scoreColonIndex + 1);

        //parses the string scores into integers
        int scoreOne = Integer.parseInt(firstScore);
        int scoreTwo = Integer.parseInt(secondScore);

        //finds the higher of the two and prints winner
        if (scoreOne > scoreTwo) {
            System.out.println("The winner is: " + firstTeam);
        } else {
            System.out.println("The winner is: " + secondTeam);
        }
    }
}