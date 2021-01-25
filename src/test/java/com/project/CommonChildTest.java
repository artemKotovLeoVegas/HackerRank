package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CommonChildTest {
    private final CommonChild commonChild = new CommonChild();

    @ParameterizedTest(name = "Counting child of {0} and {1}.")
    @MethodSource("testData")
    public void countTripletsTest(String s1, String s2, int expectedAmountOfChild) {
        assertNotNull(s1);
        assertNotNull(s2);
        Assertions.assertEquals(expectedAmountOfChild, commonChild.commonChild(s1, s2));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments("ABCD", "ABDC", 3),
                arguments("HARRY", "SALLY", 2),
                arguments("AA", "BB", 0),
                arguments("SHINCHAN", "NOHARAAA", 3),
                arguments("ABCDEF", "FBDAMN", 2)
        );
    }
}
