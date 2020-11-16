package ru.ssau.tk.PracticeTask2_30;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv27Test {

    @Test
    public void testVector() {
        assertEquals(Massiv27.vector(3), new int[][]{{1, 2, 3}, {4,5}, {6}});
    }
}