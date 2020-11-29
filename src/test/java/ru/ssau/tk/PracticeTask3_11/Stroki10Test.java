package ru.ssau.tk.PracticeTask3_11;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki10Test {

    @Test
    public void testMetod() {
        String[] array = new String[]{"I", "am", "very", "happy"};
        assertEquals(Stroki10.metod(array, "I", "m"), 0);
        assertEquals(Stroki10.metod(array,"v","y"),1);
    }
}