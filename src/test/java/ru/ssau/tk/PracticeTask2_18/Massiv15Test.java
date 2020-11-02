package ru.ssau.tk.PracticeTask2_18;

import org.testng.annotations.Test;
import ru.ssau.tk.PracticeTask2_16.Massiv13;
import ru.ssau.tk.PracticeTask2_17.Massiv14;

import static org.testng.Assert.*;

public class Massiv15Test {

    @Test
    public void testMassiv() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        assertNull(Massiv15.massiv(new int[]{}), null);

    }
}
