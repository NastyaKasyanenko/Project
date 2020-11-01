package ru.ssau.tk.PracticeTask2_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv12Test {

    @Test
    public void testMassiv() {
        int[] massiv = {1, 3, 5, 7, 9};
        assertEquals(Massiv12.massiv(massiv, 5), true);
        assertEquals(Massiv12.massiv(massiv, 2), false);
        assertNotEquals(Massiv12.massiv(massiv, 8), true);
    }
}