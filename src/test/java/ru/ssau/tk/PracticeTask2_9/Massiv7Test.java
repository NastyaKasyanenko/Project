package ru.ssau.tk.PracticeTask2_9;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massiv7Test {

    @Test
    public void testProgress() {
        double[] progression = Massiv7.progress(5,7,2);
        assertEquals(progression[0], 7, 0.0001);
        assertEquals(progression[1], 9, 0.0001);
        assertEquals(progression[2], 11, 0.0001);
        assertEquals(progression[3], 13, 0.0001);
        assertEquals(progression[4], 15, 0.0001);
    }
}
