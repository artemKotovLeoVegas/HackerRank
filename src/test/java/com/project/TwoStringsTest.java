package com.project;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoStringsTest {

    private final TwoStrings twoStrings = new TwoStrings();

    @ParameterizedTest(name = "Determine common substring in words [{0}] and [{1}].")
    @MethodSource("testData")
    public void gradingStudentsTest(String str1, String str2, String expectedOutput) {
        assertNotNull(str1);
        assertNotNull(str2);
        assertEquals(expectedOutput, twoStrings.twoStrings(str1, str2));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments("hello", "world", "YES"),
                arguments("hi", "world", "NO"),
                arguments("wouldyoulikefries", "abcabcabcabcabcabc", "NO"),
                arguments("writetoyourparents", "fghmqzldbc", "NO"),
                arguments("hackerrankcommunity", "cdecdecdecde", "YES")
        );
    }
}
