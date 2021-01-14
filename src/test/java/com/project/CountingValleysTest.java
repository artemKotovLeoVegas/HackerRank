package com.project;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountingValleysTest {
    private final CountingValleys countingValleys = new CountingValleys();

    @ParameterizedTest(name = "Counting valleys of {0} steps with for path {1}.")
    @MethodSource("testData")
    public void countTripletsTest(int steps, String path, int expectedAmountOfValleys) {
        assertTrue(steps >= 2);
        assertNotNull(path);
        assertEquals(expectedAmountOfValleys, countingValleys.countingValleys(steps, path));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(8, "UDDDUDUU", 1),
                arguments(12, "DDUUDDUDUUUD", 2),
                arguments(2, "UD", 0)
        );
    }
}
