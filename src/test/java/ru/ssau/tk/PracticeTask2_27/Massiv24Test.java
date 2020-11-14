package ru.ssau.tk.PracticeTask2_27;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv24Test {

    @Test
    public void testMassiv() {
        assertEquals(Massiv24.massiv(new int[]{1, 3, 5}), new boolean[]{false,true,false,true});
    }
}