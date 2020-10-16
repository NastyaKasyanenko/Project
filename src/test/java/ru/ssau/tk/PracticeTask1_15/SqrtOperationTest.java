package ru.ssau.tk.PracticeTask1_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    private static final double DELTA  = 0.00001;
    private static final double NEGATIVE_INFINITY = 0.00001;
    private static final double POSITIVE_INFINITY = 0.00001;
    private static final double NaN = 0.00001;
    Operation Sqrt = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(Sqrt.apply(400), 20, DELTA);
        assertNotEquals(Sqrt.apply(NEGATIVE_INFINITY), NaN, DELTA);
        assertEquals(Sqrt.apply(1), 1, DELTA);
    }
    @Test
    public void testApplyTriple() {
        assertEquals(Sqrt.apply(100),10,DELTA);
        assertEquals(Sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(Sqrt.apply(40000), 200, DELTA);
    }
}