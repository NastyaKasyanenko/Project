package ru.ssau.tk.PracticeTask3_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StrokiTest {

    @Test
    public void testSetString() {
        String arrayStr = new String("I am happy");
        new Stroki().setString(arrayStr);
    }
}