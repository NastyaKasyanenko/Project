package ru.ssau.tk.PracticeTask3_10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki9Test {

    @Test
    public void testSet() {
        String[]array = new String[]{"I","am","happy"};
        assertEquals( Stroki9.set(array,"h","y"),1);
        assertEquals(Stroki9.set(array,"a","y"),0);
    }
}