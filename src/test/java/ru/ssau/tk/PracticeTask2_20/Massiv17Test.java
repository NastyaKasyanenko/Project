package ru.ssau.tk.PracticeTask2_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv17Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        assertTrue(Massiv17.Array(array));
        int[] array1 = new int[]{21, 19, 17, 15, 13};
        assertFalse(Massiv17.Array(array1));
    }
}