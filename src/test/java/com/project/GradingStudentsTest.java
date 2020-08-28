package com.project;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradingStudentsTest {
    private final GradingStudents gradingStudents = new GradingStudents();

    @Test
    public void gradingStudentsTest() {
        assertEquals(Lists.newArrayList(75, 67, 40, 33),
                gradingStudents.gradingStudents(Lists.newArrayList(4, 73, 67, 38, 33)));
        assertEquals(Lists.newArrayList(70, 70, 37, 33),
                gradingStudents.gradingStudents(Lists.newArrayList(4, 70, 68, 37, 33)));
        assertEquals(Lists.newArrayList(75, 67, 40, 33),
                gradingStudents.gradingStudents(Lists.newArrayList(4, 73, 67, 38, 33)));
    }
}
