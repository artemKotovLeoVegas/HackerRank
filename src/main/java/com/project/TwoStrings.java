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
        List<String> list1 = new ArrayList<>(Arrays.asList(s1.split("")));
        Set<String> list2 = new HashSet<>(Arrays.asList(s2.split("")));

        for (int i = 0; i < list1.size(); i++) {
            if (list2.size() <= i) {
                break;
            }
            if (list2.contains(list1.get(i))) {
                return "YES";
            }
        }
        return "NO";
    }
}
