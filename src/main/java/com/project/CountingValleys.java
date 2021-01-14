package com.project;

public class CountingValleys {
    /**
     * https://www.hackerrank.com/challenges/counting-valleys/problem
     */
    public int countingValleys(int n, String s) {
        int valleysCount = 0;
        int stepsUpAtSeaLevel = 0;
        int stepsDownAtSeaLevel = 0;
        boolean isValleyStarted = false;
        for (String step: s.split("(?!^)")) {
            if (step.equalsIgnoreCase("u")) {
                stepsUpAtSeaLevel++;
            } else {
                stepsDownAtSeaLevel++;
            }
            if (stepsDownAtSeaLevel == 1 && stepsUpAtSeaLevel == 0 && !isValleyStarted) {
                valleysCount++;
                isValleyStarted = true;
            }
            if (stepsUpAtSeaLevel == stepsDownAtSeaLevel) {
                stepsUpAtSeaLevel = 0; stepsDownAtSeaLevel = 0;
                isValleyStarted = false;
            }
        }
        return valleysCount;
    }
}
