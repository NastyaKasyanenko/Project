package ru.ssau.tk.PracticeTask4_3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exception2Test {

    @Test
    public void testGetCharString() {
        String[] arrayStr = new String[]{"I","am","so","tired"};
        assertEquals(Exception2.getCharString(arrayStr,0,0),
                'I');
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Exception2.getCharString(arrayStr,20,0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Exception2.getCharString(arrayStr,0,20));
    }
}