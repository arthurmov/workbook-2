package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        int[] testScores = {65,76,87,92,35,64,78,34,78,23};

        double average = averageScore(testScores);
        double highest = highScore(testScores);
        double lowest = lowScore(testScores);

        System.out.printf("The average test score was %.0f\n", average);
        System.out.printf("The highest test score was %.0f\n", highest);
        System.out.printf("The lowest test score was %.0f", lowest);
    }

    public static double averageScore(int[] testScores) {
        int scores = 0;
        for(int i = 0; i < testScores.length; i++) {
            scores += testScores[i];
        }
        int average = scores / 10;
        return average;
    }

    public static double highScore(int[] testScores) {
        int highest = 0;
        for(int i = 0; i < testScores.length; i++) {
            int pointer = testScores[i];
            if(pointer > highest) {
                highest = pointer;
            }
        }
        return highest;
    }

    public static double lowScore(int[] testScores) {
        int lowest = testScores[0];
        for(int i = 0; i < testScores.length; i++) {
            int pointer = testScores[i];
            if(pointer < lowest) {
                lowest = pointer;
            }
        }
        return lowest;
    }

}
