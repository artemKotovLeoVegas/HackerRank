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

public class GradingStudentsTest {
    private final GradingStudents gradingStudents = new GradingStudents();

    @ParameterizedTest(name = "Calculation grades from {0} to {1}.")
    @MethodSource("testData")
    public void gradingStudentsTest(List<Integer> input, List<Integer> expectedOutput) {
        assertNotNull(input);
        assertTrue(input.size() > 0);
        assertEquals(expectedOutput, gradingStudents.gradingStudents(input));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(Lists.newArrayList(4, 73, 67, 38, 33),
                        Lists.newArrayList(75, 67, 40, 33)),
                arguments(Lists.newArrayList(4, 70, 68, 37, 33),
                        Lists.newArrayList(70, 70, 37, 33)),
                arguments(Lists.newArrayList(4, 73, 67, 38, 33),
                        Lists.newArrayList(75, 67, 40, 33))
        );
    }
}
