package ru.ssau.tk.PracticeTask3_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki4Test {

    @Test
    public void testStroka() {
        String str1 = "I AM HAPPY";
        String str2 = "i am happy";
        assertTrue(Stroki4.stroka(str1, str2));
        assertFalse(Stroki4.stroka(str1, str1));
        assertFalse(Stroki4.stroka(null, str2));
        assertFalse(Stroki4.stroka(str1, null));
        assertFalse(Stroki4.stroka(null, null));
    }
}