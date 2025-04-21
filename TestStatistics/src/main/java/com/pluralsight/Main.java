package com.pluralsight;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
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
