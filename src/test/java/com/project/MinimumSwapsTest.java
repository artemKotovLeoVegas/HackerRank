package com.project;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumSwapsTest {

    private final MinimumSwaps minimumSwaps = new MinimumSwaps();

    @ParameterizedTest(name = "Calculating swaps for array {0}.")
    @MethodSource("testData")
    public void minimumSwapsTest(int[] array, int expectedResult) {
        assertNotNull(array);
        assertTrue(array.length >= 1);
        assertEquals(expectedResult, minimumSwaps.minimumSwaps(array));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5}, 0),
                arguments(new int[]{4, 3, 1, 2}, 3),
                arguments(new int[]{2, 3, 4, 1, 5}, 3),
                arguments(new int[]{1, 3, 5, 2, 4, 6, 7}, 3)
        );
    }
}
