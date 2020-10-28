package ru.ssau.tk.PracticeTask2_10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv8Test {

    @Test
    public void testGeometricProgression() {
        double[] array = Massiv8.GeometricProgression(1, 2, 3);
        assertEquals(array[0], 1, 0.00001);
        assertEquals(array[1], 2, 0.00001);
        assertEquals(array[2], 4, 0.00001);
    }
}