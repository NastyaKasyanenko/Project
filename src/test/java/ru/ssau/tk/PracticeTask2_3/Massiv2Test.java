package ru.ssau.tk.PracticeTask2_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv2Test {

    @Test
    public void testMassiv() {
        int[] array = Massiv2.massiv(5);
        assertEquals(array[0], 1);
        assertEquals(array[1], 3);
        assertEquals(array[2], 5);
        assertEquals(array[3], 7);
        assertEquals(array[4], 9);
    }
}
