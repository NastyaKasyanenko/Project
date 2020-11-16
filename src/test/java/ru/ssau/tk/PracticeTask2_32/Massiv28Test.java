package ru.ssau.tk.PracticeTask2_32;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv28Test {

    @Test
    public void testSort() {
        Double[] array = new Double[]{Double.NaN,1.,3.};
        Massiv28.sort(array);
        assertEquals(array[2].doubleValue(),3.);
        assertEquals(array[0].doubleValue(),Double.NaN);
    }
}