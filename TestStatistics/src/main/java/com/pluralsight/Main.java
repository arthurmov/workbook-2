package com.pluralsight;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //initializing test scores array and needed variables
        int[] testScores = {65,76,87,92,35,64,78,34,78,23};

        double average = averageScore(testScores);
        double highest = highScore(testScores);
        double lowest = lowScore(testScores);
        double median = medianScore(testScores);

        double diffBetweenAverageAndMedian = average - median;

        System.out.printf("The average test score was %.0f\n", average);
        System.out.printf("The highest test score was %.0f\n", highest);
        System.out.printf("The lowest test score was %.0f\n", lowest);
        System.out.printf("The median test score was %.0f\n", median);
        System.out.println("The difference between the average and median is " + diffBetweenAverageAndMedian);
    }

    //method to find the average score
    public static double averageScore(int[] testScores) {
        int scores = 0;
        for(int i = 0; i < testScores.length; i++) {
            scores += testScores[i];
        }
        int average = scores / 10;
        return average;
    }

    //method to find the highest score
    public static double highScore(int[] testScores) {
        int highest = 0;
        for(int i = 0; i < testScores.length; i++) {
            if(testScores[i] > highest) {
                highest = testScores[i];
            }
        }
        return highest;
    }

    //method to find the lowest score
    public static double lowScore(int[] testScores) {
        int lowest = testScores[0];
        for(int i = 0; i < testScores.length; i++) {
            if(testScores[i] < lowest) {
                lowest = testScores[i];
            }
        }
        return lowest;
    }

    //method to find the median
    public static double medianScore(int [] testScores) {
        Arrays.sort(testScores);
        double median;
        int mid = testScores.length/2;

        if(testScores.length % 2 == 0) {
            median = (double)(testScores[mid - 1] + testScores[mid]) / 2;
        } else {
            median = testScores[mid];
        }
        return median;
    }
}