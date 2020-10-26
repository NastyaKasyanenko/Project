package ru.ssau.tk.PracticeTask2_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv4Test {

    @Test
    public void testMassiv() {
        int[] arr = Massiv4.massiv(7);
        assertEquals(arr[0],0);
        assertEquals(arr[1],1);
        assertEquals(arr[2],1);
        assertEquals(arr[3],2);
        assertEquals(arr[4],3);
        assertEquals(arr[5],5);
        assertEquals(arr[6],8);
    }
}
