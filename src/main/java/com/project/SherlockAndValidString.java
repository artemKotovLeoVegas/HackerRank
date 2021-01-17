package com.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndValidString {
    /**
     * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
     */

    public String isValid(String str) {
        Map<Character, Integer> mapOfChars = new HashMap<>();
        for (char c : str.toCharArray()) {
            mapOfChars.put(c, mapOfChars.getOrDefault(c, 0) + 1);
        }

        List<Integer> differencesByAmount = mapOfChars.values().stream().
                sorted().
                distinct().
                collect(Collectors.toList());
        if (differencesByAmount.size() == 1) {
            return "YES";
        } else if (differencesByAmount.size() > 2) {
            return "NO";
        } else {
            List<Integer> firstDifferenceAmounts = mapOfChars.values().stream().
                    filter(it -> it == differencesByAmount.get(0)).
                    collect(Collectors.toList());
            List<Integer> secondDifferenceAmounts = mapOfChars.values().stream().
                    filter(it -> it == differencesByAmount.get(1)).
                    collect(Collectors.toList());

            int firstAmountsSize = firstDifferenceAmounts.size();
            int firstAmount = firstDifferenceAmounts.get(0);
            int secondAmountsSize = secondDifferenceAmounts.size();
            int secondAmount = secondDifferenceAmounts.get(0);

            if ((firstDifferenceAmounts.size() == 1 && firstDifferenceAmounts.get(0) == 1)
                    || (secondDifferenceAmounts.size() == 1 && secondDifferenceAmounts.get(0) == 1)) {
                return "YES";
            }
            if (firstAmount == secondAmount
                    || (Math.abs(firstAmount - secondAmount) == 1 && (firstAmountsSize == 1
                            || secondAmountsSize == 1))) {
                return "YES";
            }
            return "NO";
        }
    }
}
