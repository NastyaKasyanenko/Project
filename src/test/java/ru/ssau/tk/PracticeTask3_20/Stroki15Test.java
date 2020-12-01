package ru.ssau.tk.PracticeTask3_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki15Test {

    @Test
    public void testStroka() {
        String[] str = {"I", "am", "very", "happy"};
        assertEquals(Stroki15.stroka(str), "I, am, very, happy");
    }
}