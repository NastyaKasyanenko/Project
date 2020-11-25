package ru.ssau.tk.PracticeTask3_9;

import org.testng.annotations.Test;
import ru.ssau.tk.PracticeTask3_8.Stroki7;

import static org.testng.Assert.*;

public class Stroki8Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Stroki8.getIndexOf("happy", "ha"),0);
        assertEquals(Stroki8.getIndexOf("parents", "nts"),-1);
    }
}