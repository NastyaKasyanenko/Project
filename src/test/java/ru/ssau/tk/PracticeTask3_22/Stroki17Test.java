package ru.ssau.tk.PracticeTask3_22;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki17Test {

    @Test
    public void testGetStringOfNumber() {
        assertEquals(Stroki17.getStringOfNumber(7),"0123456");
        System.out.println(Stroki17.getStringOfNumber(10000));
    }
}