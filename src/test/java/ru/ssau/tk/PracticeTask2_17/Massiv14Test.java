package ru.ssau.tk.PracticeTask2_17;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv14Test {

    @Test
    public void testNumberEven() {
        int[] massiv = new int[15];
        for(int i=0;i<massiv.length;i++){
            massiv[i] = i;
        }
        assertEquals(Massiv14.number(massiv),8);
    }
}
