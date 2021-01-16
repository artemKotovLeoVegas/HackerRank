package com.project;

import java.util.List;
import java.util.stream.Collectors;

public class SpecialStringAgain {

    private long countSubStrings;

    public long substrCount(String str) {
        List<Integer> chars = str.chars().
                boxed().
                collect(Collectors.toList());
        countSubStrings = chars.size();

        for (int charsAmount = 2; charsAmount <= chars.size(); charsAmount++) {
            for (int startIndex = 0; startIndex < chars.size() - 1; startIndex++) {
                List<Integer> subCharsList = chars.subList(startIndex, getIndex(startIndex, charsAmount, chars.size()));
                if (subCharsList.size() < charsAmount) {
                    break;
                }
                calculateDuplicates(subCharsList);
                if ((charsAmount % 2) > 0) {
                    calculateSplitDuplicates(subCharsList, charsAmount);
                }
            }
        }

        return countSubStrings;
    }

    private int getIndex(int start, int length, int size) {
        int index = start + length;
        if (index > size)
            return size - 1;
        return index;
    }

    private void calculateDuplicates(List<Integer> subCharsList) {
        boolean isEqualChars = subCharsList.stream().allMatch(c -> c == subCharsList.get(0));
        if (isEqualChars) {
            countSubStrings++;
        }
    }

    private void calculateSplitDuplicates(List<Integer> subCharsList, int charsAmount) {
        int midPos = Math.floorDiv(charsAmount, 2);
        List<Integer> leftPart = subCharsList.subList(0, midPos);
        List<Integer> midPart = subCharsList.subList(midPos, midPos + 1);
        List<Integer> rightPart = subCharsList.subList(midPos + 1, subCharsList.size());
        if (leftPart.equals(rightPart) && !midPart.equals(leftPart)) {
            countSubStrings++;
        }
    }
}
