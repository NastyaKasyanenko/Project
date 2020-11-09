package ru.ssau.tk.PracticeTask2_23;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv20Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        Massiv20.Array(array);
        assertEquals(array[0], 9);
        assertEquals(array[4], 1);
    }
}
