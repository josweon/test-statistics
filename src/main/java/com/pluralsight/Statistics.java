package com.pluralsight;

import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        int[] testScores = {10, 20, 30, 44, 55, 63, 45, 66, 75, 89};

        int sum = 0;
        int highScore = Integer.MIN_VALUE;
        int lowScore = Integer.MAX_VALUE;
        int median;
        int n = testScores.length;

        for (int i = 0; i < n; i++) {
            // sum
            sum += testScores[i];

            // highScore
            if (testScores[i] > highScore) {
                highScore = testScores[i];
            }

            // lowScore
            if (testScores[i] < lowScore) {
                lowScore = testScores[i];
            }
        }
        // average
        int average = sum / n;

        // median
        Arrays.sort(testScores);

        int middle = n/2;
        median = (testScores[middle] + testScores[middle - 1]) / 2;

        // test order
//        for (int score: testScores){
//            System.out.print(score + " ");
//
        System.out.printf("Average = %d%n", average);
        System.out.printf("Highscore = %d%n", highScore);
        System.out.printf("Lowscore = %d%n", lowScore);
        System.out.printf("Median([%d,%d]) = %d", testScores[middle - 1], testScores[middle], median);
    }
}
