package com.project;

import com.google.common.collect.Lists;
import com.project.internal.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SortingComparatorTest {

    private final SortingComparator sortingComparator = new SortingComparator();
    private ArrayList inputData;
    private ArrayList expectedOutputData;

    @BeforeEach
    void setUp() {
        inputData = Lists.newArrayList(
                new Player("david", 100),
                new Player("amy", 100),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150));
        expectedOutputData = Lists.newArrayList(
                new Player("aleksa", 150),
                new Player("amy", 100),
                new Player("david", 100),
                new Player("aakansha", 75),
                new Player("heraldo", 50));
    }

    @Test
    public void sortingComparatorTest() {
        assertNotNull(inputData);
        assertNotNull(expectedOutputData);
        Collections.sort(inputData, sortingComparator);
        assertEquals(expectedOutputData, inputData);
    }
}
