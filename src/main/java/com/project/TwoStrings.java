package com.project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TwoStrings {
    /**
     https://www.hackerrank.com/challenges/two-strings/problem
     */

    public String twoStrings(String s1, String s2) {
        String[] bothStrings = Stream.concat(Arrays.stream(s1.split("")), Arrays.stream(s2.split("")))
                .toArray(String[]::new);
        Set<String> set = new HashSet<String>(Arrays.asList(bothStrings));

        if (set.size() < bothStrings.length) {
            return "YES";
        }
        return "NO";
    }
}
