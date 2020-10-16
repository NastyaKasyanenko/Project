package ru.ssau.tk.PracticeTask1_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private static final double DELTA  = 0.00001;
    private static final double NEGATIVE_INFINITY = 0.00001;
    private static final double POSITIVE_INFINITY  = 0.00001;
    Operation Identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(Identical.apply(300), 300, DELTA);
        assertEquals(Identical.apply(NEGATIVE_INFINITY), NEGATIVE_INFINITY, DELTA);
        assertEquals(Identical.apply(POSITIVE_INFINITY), POSITIVE_INFINITY, DELTA);
    }
}