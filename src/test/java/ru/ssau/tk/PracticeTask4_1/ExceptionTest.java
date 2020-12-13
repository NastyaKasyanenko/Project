package ru.ssau.tk.PracticeTask4_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.PracticeTask1_2.Person;

import static org.testng.Assert.*;

public class ExceptionTest {

    @Test
    public void testObjectPerson() {
        Person person1 = new Person("Svetlana", "Ivanova");
        assertEquals(Exception.objectPerson(person1), "Svetlana Ivanova");
        Person person2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> Exception.objectPerson(person2));
    }
}