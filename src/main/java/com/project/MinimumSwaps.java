package com.project;

public class MinimumSwaps {

    public int minimumSwaps(int[] array) {
        int amountOfSwaps = 0;
        boolean hasSwaps = true;
        while (hasSwaps) {
            hasSwaps = false;
            int expectedValue = 1;
            for (int pos = 0; pos < array.length; pos++) {
                if (array[pos] != expectedValue) {
                    int temp = array[pos];
                    array[pos] = array[temp - 1];
                    array[temp - 1] = temp;
                    hasSwaps = true;
                    amountOfSwaps++;
                }
                expectedValue++;
            }
        }
        return amountOfSwaps;
    }
}
