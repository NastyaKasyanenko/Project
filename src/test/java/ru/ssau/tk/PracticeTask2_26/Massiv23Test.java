package ru.ssau.tk.PracticeTask2_26;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv23Test {

    @Test
    public void testSum() {
        assertEquals(Massiv23.sum(new int[]{1, 3, 5, 7, 9}), new int[]{4, 12, 9});
        assertEquals(Massiv23.sum(new int[]{1, 3, 5, 7, 9, 11, 13, 15}), new int[]{4, 12, 20, 28});

    }
}