package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTriplets {
    /** WIP
     * https://www.hackerrank.com/challenges/count-triplets-1/problem
     */

    long countTriplets(List<Long> arr, long r) {
        long tripletsCount = 0;
        /*HashMap<Long, Integer> map = new HashMap<>();
        arr.forEach(e -> map.compute(e, (k, v) -> v == null ? 1 : v + 1));

        List<Long> keys = map.keySet().stream().
                sorted().
                collect(Collectors.toList());

        for (int index = 0; index < keys.size(); index++) {
            List<Long> triple = new ArrayList(Arrays.asList(keys.get(index)));
            long nextValueForTriple = keys.get(index) * r;
            for (int i = (index + 1); i < keys.size(); i++) {
                if (keys.get(i) == nextValueForTriple) {
                    triple.add(keys.get(i));
                    nextValueForTriple = nextValueForTriple * r;
                }
                if (triple.size() == 3) {
                    tripletsCount++;
                    for (Long tripleElement : triple) {
                        if (map.get(tripleElement) > 1) {
                            map.put(tripleElement, (map.get(tripleElement) - 1));
                            index--;
                        }
                    }
                    break;
                }
            }
        }*/

        for (int index = 0; index < arr.size(); index++) {
            List<Long> triple = new ArrayList(Arrays.asList(arr.get(index)));
            long nextValueForTriple = arr.get(index) * r;
            int duplicates = 0;
            for (int i = (index + 1); i < arr.size(); i++) {
                if (arr.get(i).longValue() == triple.get(triple.size() - 1)) {
                    duplicates++;
                    if (nextValueForTriple != arr.get(i)) {
                        continue;
                    }
                }
                if (arr.get(i) == nextValueForTriple) {
                    triple.add(arr.get(i));
                    nextValueForTriple = nextValueForTriple * r;
                }
                if (triple.size() == 3) {
                    tripletsCount++;
                    if (duplicates >= 0) {
                        tripletsCount += duplicates;
                    }
                    break;
                }
            }
        }

        return tripletsCount;
    }
}
