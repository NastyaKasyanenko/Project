package ru.ssau.tk.PracticeTask4_4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exception3Test {

    @Test
    public void testGetString() {
        Exception3.getString("4","2"); // output: 2
        Assert.assertThrows(ArithmeticException.class,
                () ->   Exception3.getString("4","0"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Exception3.getString("u","1"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Exception3.getString("u","a"));
    }
}