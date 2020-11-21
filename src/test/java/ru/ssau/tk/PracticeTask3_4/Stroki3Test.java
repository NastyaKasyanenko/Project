package ru.ssau.tk.PracticeTask3_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki3Test {

    @Test
    public void testStroka() {
        assertEquals(Stroki3.stroka("I"),true);
        assertEquals(Stroki3.stroka("am"),false);
        assertEquals(Stroki3.stroka("happy"),false);
    }
}