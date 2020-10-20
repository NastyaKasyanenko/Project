package ru.ssau.tk.PracticeTask1_18;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    private static final double DELTA  = 0.00001;
    private static final double NaN  = 0.00001;
    IntGeneratorImpl generator = new IntGeneratorImpl();

    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(),0, 0.00001);
        assertNotEquals(generator.nextInt(),0.2, 0.00001 );
        assertEquals(generator.nextInt(),2, 0.00001);
        assertNotEquals(generator.nextInt(),NaN, 0.00001);
    }
}