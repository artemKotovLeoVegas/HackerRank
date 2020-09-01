package com.project;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GradingStudentsTest {
    private final GradingStudents gradingStudents = new GradingStudents();

    @ParameterizedTest(name = "Calculation grades from {0} to {1}.")
    @MethodSource("testData")
    @EnabledOnOs({OS.MAC})
    public void gradingStudentsTest(List<Integer> input, List<Integer> expectedOutput) {
        assumingThat((input != null && input.size() > 0),
                () -> {
                    assertEquals(expectedOutput, gradingStudents.gradingStudents(input));
                });
        assertTrue(input != null && input.size() > 0, "Input list of grades is blank!");
        assertTrue(expectedOutput != null && expectedOutput.size() > 0, "Expected output list of grades is blank!");
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
