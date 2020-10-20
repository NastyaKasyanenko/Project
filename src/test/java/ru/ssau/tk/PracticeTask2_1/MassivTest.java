package ru.ssau.tk.PracticeTask2_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MassivTest {
    Massiv massiv1 = new Massiv();
    int[] massiv2 = new int[10];
    int[] massiv3 = new int[20];

    @Test
    public void testMassiv() {
        assertEquals(massiv1.massiv(10), massiv2);
        assertEquals(massiv1.massiv(20), massiv3);
        assertNotEquals(massiv1.massiv(15), massiv3);
    }
}