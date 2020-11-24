package ru.ssau.tk.PracticeTask3_7;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki6Test {

    @Test
    public void testIndex() {
        assertEquals(Stroki6.index("abcabcabc","ca"),2);
        assertEquals(Stroki6.index("cat","taxi"),-1);
    }
}