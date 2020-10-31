package ru.ssau.tk.PracticeTask2_14;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv11Test {

    @Test
    public void testMassiv() {
        int massiv[] = new int[]{1, -2, 3, -4, 5};
        Massiv11.massiv(massiv);
        assertEquals((massiv[0]), -1);
        assertEquals((massiv[1]), 2);
        assertEquals(massiv[2],-3);
        assertEquals(massiv[3],4);
        assertEquals(massiv[4],-5);
    }
}