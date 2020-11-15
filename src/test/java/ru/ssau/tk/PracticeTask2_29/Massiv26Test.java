package ru.ssau.tk.PracticeTask2_29;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv26Test {

    @Test
    public void testArray() {
        int[] array = Massiv26.Array(7, 3);
        assertEquals(array[0],5);
        assertEquals(array[1],6);
        assertEquals(array[2],7);
        assertEquals(array[3],1);
    }
}