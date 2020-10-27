package ru.ssau.tk.PracticeTask2_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massive6Test {

    @Test
    public void testMassiv() {
        double[] integer = Massive6.massiv(15);
        assertEquals(integer[0], 1);
        assertEquals(integer[1], 2);
        assertEquals(integer[2], 4);
        assertEquals(integer[3], 5);
        assertEquals(integer[4], 7);
        assertEquals(integer[5], 8);
        assertEquals(integer[6], 10);
        assertEquals(integer[7], 11);
        assertEquals(integer[8], 13);
        assertEquals(integer[9], 14);
        assertEquals(integer[10], 16);
        assertEquals(integer[11], 17);
        assertEquals(integer[12], 19);
        assertEquals(integer[13], 20);
        assertEquals(integer[14], 22);
    }
}
