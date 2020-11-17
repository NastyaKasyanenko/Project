package ru.ssau.tk.PracticeTask2_34;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv30Test {

    @Test
    public void testMultiply() {
        assertEquals(Massiv30.multiply(new Double[]{1., Double.NaN,
                        Double.NEGATIVE_INFINITY,
                        Double.POSITIVE_INFINITY}).doubleValue(),
                4.);
    }
}