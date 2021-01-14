package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoStrings {
    /**
     * https://www.hackerrank.com/challenges/two-strings/problem
     */

    public String twoStrings(String s1, String s2) {
        List<String> list = new ArrayList<>(Arrays.asList(s1.split("")));
        Set<String> set = new HashSet<>(Arrays.asList(s2.split("")));

        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                return "YES";
            }
        }
        return "NO";
    }
}
