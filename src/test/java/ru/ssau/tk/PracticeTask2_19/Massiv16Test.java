package ru.ssau.tk.PracticeTask2_19;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv16Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        assertEquals(Massiv16.Array(array),15);//1+5+9
    }
}