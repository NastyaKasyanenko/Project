package ru.ssau.tk.PracticeTask3_12;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Stroki11Test {

    @Test
    public void testMetod() {
        assertEquals(new Stroki11().metod("opopopopo", "opo", "po"), "popppo");
    }
}
    