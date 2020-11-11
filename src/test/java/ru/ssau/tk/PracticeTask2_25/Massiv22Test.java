package ru.ssau.tk.PracticeTask2_25;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv22Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 3, 5};
        int[] arr = Massiv22.array(array);
        assertEquals(array[0],1);
        assertEquals(array[0],1);
    }
}