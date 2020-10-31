package ru.ssau.tk.PracticeTask2_13;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv10Test {
    private static final double DELTA = 0.0001;

    @Test
    public void testMassiv() {

        int[] array = Massiv10.massiv(9);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[1], 2, DELTA);
        assertEquals(array[2], 3, DELTA);
        assertEquals(array[3], 4, DELTA);
        assertEquals(array[4], 5, DELTA);
        assertEquals(array[5], 4, DELTA);
        assertEquals(array[6], 3, DELTA);
        assertEquals(array[7], 2, DELTA);
        assertEquals(array[8], 1, DELTA);
    }
}