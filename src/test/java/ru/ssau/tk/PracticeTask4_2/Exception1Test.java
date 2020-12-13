package ru.ssau.tk.PracticeTask4_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.PracticeTask4_2.Exception1;

import static org.testng.Assert.*;

public class Exception1Test {

    @Test
    public void testSet() {
        String[] str = {"I", "am", "very", "happy"};
        assertEquals(Exception1.getSymbol(str, 0), new String[]{"I", "a", "v", "h"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Exception1.getSymbol(str, 1));

        Assert.assertThrows(NullPointerException.class,
                () -> Exception1.getSymbol(null, 0));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> Exception1.getSymbol(str1, 0));
    }
}