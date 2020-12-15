package ru.ssau.tk.PracticeTask4_5;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChildTest{

    @Test
    void test(){
        Child temp = new Child();
        Assert.assertThrows(CloneNotSupportedException.class, temp::clone);
    }
}