package ru.ssau.tk.PracticeTask1_3and1_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint second = new NamedPoint(1, 2, 3);
    NamedPoint first = new NamedPoint(4, 5, 6, "Nastya");


    @Test
    public void testSetName() {
        first.setName("Oleg");
        second.setName("cat");
        assertEquals(second.getName(), "cat");
        assertEquals(first.getName(), "Oleg");
    }

    @Test
    public void testGetName() {
        assertNull(second.getName());
        assertEquals(first.getName(), "Nastya");
    }
}