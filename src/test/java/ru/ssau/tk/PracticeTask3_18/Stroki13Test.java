package ru.ssau.tk.PracticeTask3_18;

import org.testng.annotations.Test;
import ru.ssau.tk.PracticeTask1_2.Person;
import ru.ssau.tk.PracticeTask1_3and1_4.NamedPoint;
import ru.ssau.tk.PracticeTask1_3and1_4.Point;

import static org.testng.Assert.*;

public class Stroki13Test {

    @Test
    public void testGetDescription() {
        Stroki13.getDescription(new Person("Ivan", "Pelmenikov", 567474));
        Stroki13.getDescription(new Point(0, 1, 2));
        Stroki13.getDescription(new NamedPoint(0, 1, 4, "X"));
    }
}