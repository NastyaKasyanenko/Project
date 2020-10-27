package ru.ssau.tk.PracticeTask2_6;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv5Test {

    @Test
    public void testMassiv() {
        int[] pow = Massiv5.massiv(5);
        assertEquals(pow[0], 0);
        assertEquals(pow[1], 1);
        assertEquals(pow[2], 4);
        assertEquals(pow[3], 9);
        assertEquals(pow[4], 16);
    }
}
