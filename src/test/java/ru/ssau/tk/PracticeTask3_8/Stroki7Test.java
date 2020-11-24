package ru.ssau.tk.PracticeTask3_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki7Test {

    @Test
    public void testIndexof() {
        assertEquals(Stroki7.indexof("happy", "ha"), -1);
        assertEquals(Stroki7.indexof("parents", "nts"),4);
    }
}