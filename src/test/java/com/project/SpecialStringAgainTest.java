package com.project;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpecialStringAgainTest {

    private final SpecialStringAgain specialStringAgain = new SpecialStringAgain();

    @ParameterizedTest(name = "Calculating special strings in string {0}.")
    @MethodSource("testData")
    public void specialStringAgainTest(String str, long expectedResult) {
        assertNotNull(str);
        assertEquals(expectedResult, specialStringAgain.substrCount(str));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments("aaaa", 10),
                arguments("abcbaba", 10),
                arguments("asasd", 7)
        );
    }
}
