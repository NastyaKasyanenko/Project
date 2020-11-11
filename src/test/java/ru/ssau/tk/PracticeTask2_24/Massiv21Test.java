package ru.ssau.tk.PracticeTask2_24;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv21Test {

    @Test
    public void testSdvig() {
        int[] massiv = new int[]{1, 3, 5, 7, 9};
        Massiv21.sdvig(massiv);
        assertEquals(massiv[0], -2);
        Massiv21.sdvig(massiv);
        assertEquals(massiv[0], 1);
    }
}