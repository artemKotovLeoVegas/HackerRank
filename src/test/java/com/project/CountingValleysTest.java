package com.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleysTest {
    private final CountingValleys countingValleys = new CountingValleys();

    @Test
    public void countingValleysTest() {
        assertEquals(1, countingValleys.countingValleys(8, "UDDDUDUU"));
        assertEquals(2, countingValleys.countingValleys(12, "DDUUDDUDUUUD"));
    }
}
