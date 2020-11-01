package ru.ssau.tk.PracticeTask2_16;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv13Test {

    @Test
    public void testMassiv() {
        Integer[] massiv = new Integer[5];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        massiv[3] = 4;
        massiv[4] = null;
        assertTrue(Massiv13.massiv(massiv));
    }
}


