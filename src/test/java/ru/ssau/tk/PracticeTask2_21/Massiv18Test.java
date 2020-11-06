package ru.ssau.tk.PracticeTask2_21;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv18Test {

    @Test
    public void testNumber() {
        int[] array = new int[]{1, 3, 5, 5, 7};
        assertEquals(Massiv18.Number(array), 5);
        int[] temp = new int[]{0, 0, 1, 2, 3};
        assertEquals(Massiv18.Number(temp), 0);
    }
}