package com.project;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PairsTest {

    private final Pairs pairs = new Pairs();

    @ParameterizedTest(name = "Determine amount of pairs for {0} in {1}.")
    @MethodSource("testData")
    public void gradingStudentsTest(int difference, int[] array, int expectedResult) {
        assertNotNull(array);
        assertTrue(array.length > 0);
        assertEquals(expectedResult, pairs.pairs(difference, array));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(2, new int[]{1, 5, 3, 4, 2}, 3),
                arguments(1, new int[]{1, 5, 3, 2}, 2)
        );
    }
}
