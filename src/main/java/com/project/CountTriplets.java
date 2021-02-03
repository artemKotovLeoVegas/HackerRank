package com.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
    /**
     * WIP
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

        Map<Long, Long> count = new HashMap<>(); // count of ints
        Map<Long, Long> tuplets = new HashMap<>(); // map 2nd -> count of links

        for (int i = 0; i < arr.size(); ++i) {
            long val = arr.get(i);
            if (val % r == 0 && tuplets.containsKey(val / r)) {
                tripletsCount += tuplets.get(val / r);
            }
            if (tuplets.containsKey(val)) {
                tuplets.put(val, tuplets.get(val) + count.get(val / r));
            } else if (val % r == 0 && count.containsKey(val / r)) {
                tuplets.put(val, count.get(val / r));
            }
            if (count.containsKey(val))
                count.put(val, count.get(val) + 1);
            else
                count.put(val, 1L);
        }

        return tripletsCount;
    }
}
