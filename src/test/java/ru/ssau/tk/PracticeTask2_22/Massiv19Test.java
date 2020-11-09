package ru.ssau.tk.PracticeTask2_22;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv19Test {

    @Test
    public void testIndexOftenNumber() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        assertEquals(Massiv19.IndexOftenNumber(array, 1), 0);
        assertEquals(Massiv19.IndexOftenNumber(array, 5), 2);
        assertEquals(Massiv19.IndexOftenNumber(array, 7), 3);
    }
}
