package com.project;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountTripletsTest {

    private final CountTriplets countTriplets = new CountTriplets();

    @ParameterizedTest(name = "Calculation triples for array {0} with r = {1}.")
    @MethodSource("testData")
    public void countTripletsTest(List<Long> inputArr, long r, long expectedAmountOfTriples) {
        assertNotNull(inputArr);
        assertTrue(r > 0);
        assertEquals(expectedAmountOfTriples, countTriplets.countTriplets(inputArr, r));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(Lists.newArrayList(1L, 2L, 2L, 4L), 2, 2),
                arguments(Lists.newArrayList(1L, 3L, 9L, 9L, 27L, 81L), 3, 6),
                arguments(Lists.newArrayList(1L, 5L, 5L, 25L, 125L), 5, 4),
                arguments(Lists.newArrayList(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L), 1, 161700)
        );
    }
}
