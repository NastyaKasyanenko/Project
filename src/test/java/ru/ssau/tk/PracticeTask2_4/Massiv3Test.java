package ru.ssau.tk.PracticeTask2_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv3Test {

    @Test
    public void testMassiv() {
        int[] array = Massiv3.massiv(5);
        assertEquals(array[0], 10);
        assertEquals(array[1], 8);
        assertEquals(array[2],6);
        assertEquals(array[3], 4);
        assertEquals(array[4],2);
    }
}