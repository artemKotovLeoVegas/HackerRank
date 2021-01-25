package com.project;

public class CommonChild {
    /**
     * https://www.hackerrank.com/challenges/common-child/problem
     */
    public int commonChild(String s1, String s2) {
        int[][] array = new int[s1.length() + 1][s2.length() + 1];
        for (int x = 1; x < s1.length() + 1; x++) {
            for (int y = 1; y < s2.length() + 1; y++) {
                if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
                    array[x][y] = array[x - 1][y - 1] + 1;
                } else {
                    array[x][y] = Math.max(array[x - 1][y], array[x][y - 1]);
                }
            }
        }
        return array[s1.length()][s2.length()];
    }
}
