package ru.ssau.tk.PracticeTask3_24;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

import static org.testng.Assert.*;

public class Stroki19Test {

    @Test
    public void testChangeCharsetStr() {
        String str = "I am very happy";
        Stroki19.changeCharsetStr(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16LE);
        Stroki19.changeCharsetStr(str,StandardCharsets.UTF_16LE,StandardCharsets.UTF_8);
    }
}