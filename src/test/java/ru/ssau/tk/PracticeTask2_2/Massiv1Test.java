package ru.ssau.tk.PracticeTask2_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv1Test {

    @Test
    public void testMassiv() {
        int[] firstArray = Massiv1.massiv(7);
        assertEquals(firstArray.length, 7);
        assertEquals(firstArray[6], 2);
        assertEquals(firstArray[5], 1);
        assertEquals(firstArray[4], 1);
        assertEquals(firstArray[3], 1);
        assertEquals(firstArray[2], 1);
        assertEquals(firstArray[1], 1);
        assertEquals(firstArray[0], 2);
    }
}
