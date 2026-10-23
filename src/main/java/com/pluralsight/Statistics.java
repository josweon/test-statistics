package com.pluralsight;

public class Statistics {
    public static void main(String[] args) {
        int[] testScores = {10,20,30,44,55,63,45,66,75,89};

        int sum = 0;
        int highScore = Integer.MIN_VALUE;
        int lowScore = Integer.MAX_VALUE;
        int median;
        int n = testScores.length;

        for(int i = 0; i < n; i++) {
            // average
            sum += testScores[i];

        }
        // average
        int average = sum / n;


    }
}
