package com.project;

import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountingValleysTest {
    private final CountingValleys countingValleys = new CountingValleys();

    @ParameterizedTest(name = "Counting valleys for {0} with r = {1}.")
    @MethodSource("testData")
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    public void countTripletsTest(int steps, String path, int expectedValleys) {
        assertEquals(expectedValleys, countingValleys.countingValleys(steps, path));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(8, "UDDDUDUU", 1),
                arguments(12, "DDUUDDUDUUUD", 2)
        );
    }
}
