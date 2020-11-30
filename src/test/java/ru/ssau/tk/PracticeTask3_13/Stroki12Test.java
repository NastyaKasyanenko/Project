package ru.ssau.tk.PracticeTask3_13;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki12Test {

    @Test
    public void testString() {
        String str = "I am very happy";
        int maxSizeStr = str.length();
        assertEquals(Stroki12.string(str, -3, maxSizeStr), str);
        assertEquals(Stroki12.string(str, 2, maxSizeStr), str.substring(2));
        assertEquals(Stroki12.string(str, -2, 14), str.substring(0, 14));
        assertEquals(Stroki12.string(str, 2, 14), str.substring(2, 14));
    }
}