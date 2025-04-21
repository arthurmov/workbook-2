package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int roll1;
        int roll2;
        int numOf2 = 0;
        int numOf4 = 0;
        int numOf6 = 0;
        int numOf7 = 0;

        Dice dice = new Dice();

        for(int count = 1; count <= 100; count++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int rollTotal = roll1 + roll2;
            System.out.printf("Roll %d: %d - %d Sum: %d\n", count, roll1, roll2, rollTotal);


        if(rollTotal == 2) {
            numOf2++;
        }
        if(rollTotal == 4) {
            numOf4++;
        }
        if(rollTotal == 6) {
            numOf6++;
        }
        if(rollTotal == 7) {
            numOf7++;
        }
        }

        System.out.println("Total number of 2s: "+numOf2);
        System.out.println("Total number of 4s: "+numOf4);
        System.out.println("Total number of 6s: "+numOf6);
        System.out.println("Total number of 7s: "+numOf7);
    }
}
