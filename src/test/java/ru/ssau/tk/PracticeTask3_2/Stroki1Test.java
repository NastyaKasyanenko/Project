package ru.ssau.tk.PracticeTask3_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki1Test {

    @Test
    public void testStr() {
        String stroka = "I am happy";
        new Stroki1().getStr(stroka);
        String stroka1 = "Я счастлива";
        new Stroki1().getStr(stroka1);
    }
}