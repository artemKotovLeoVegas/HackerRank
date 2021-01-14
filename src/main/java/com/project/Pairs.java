package com.project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Pairs {
    /**
     * https://www.hackerrank.com/challenges/pairs/problem
     */

    public int pairs(int k, int[] arr) {
        HashSet<Integer> set = Arrays.stream(arr).
                boxed().
                collect(Collectors.toCollection(HashSet::new));
        int pairsAmount = 0;
        for (int value : arr) {
            if (set.contains(value - k)) {
                pairsAmount++;
            }
        }
        return pairsAmount;
    }
}
