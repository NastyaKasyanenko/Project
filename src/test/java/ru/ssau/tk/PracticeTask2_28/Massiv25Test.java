package ru.ssau.tk.PracticeTask2_28;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv25Test {

    @Test
    public void testLongToInt() {
        assertEquals(Massiv25.intToLong(Massiv25.longToInt(6L)), 6L);
        assertEquals(Massiv25.intToLong(Massiv25.longToInt(0L)), 0L);
    }
}