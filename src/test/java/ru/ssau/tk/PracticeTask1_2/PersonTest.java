package ru.ssau.tk.PracticeTask1_2;

import org.testng.annotations.Test;
import ru.ssau.tk.PracticeTask1_17.Gender;

import static org.testng.Assert.*;

public class PersonTest {

@Test
public void testFirstName(){
        Person somePerson = new Person();
        somePerson.setFirstName("Nastya");
        assertEquals(somePerson.getfirstName(), "Nastya");
        assertNotEquals(somePerson.getfirstName(), "Seva");

        somePerson.setFirstName("Oleg");
        assertNotEquals(somePerson.getfirstName(), "Nastya");
        assertEquals(somePerson.getfirstName(), "Oleg");
        assertNotEquals(somePerson.getfirstName(), "Seva");
        }

@Test
public void testLastName(){
        Person somePerson = new Person();
        somePerson.setlastName("Kasyanenko");
        assertEquals(somePerson.getlastName(), "Kasyanenko");
        assertNotEquals(somePerson.getfirstName(), "Krechko");

        somePerson.setlastName("Krechko");
        assertNotEquals(somePerson.getlastName(), "Pelmennikov");
        assertEquals(somePerson.getlastName(), "Krechko");
        }

@Test
public void testPassportId(){
        Person somePerson = new Person();
        somePerson.setpassportId(1234);
        assertEquals(somePerson.getpassportId(), 1234);

        somePerson.setpassportId(5678);
        assertNotEquals(somePerson.getpassportId(), 1234);
        assertEquals(somePerson.getpassportId(), 5678);
        }
        @Test
        public void testGender(){
                Person somePerson = new Person("Nastya", "Kasyanenko", 1234, Gender.MALE);

                assertNotEquals(somePerson.getGender(), Gender.FEMALE);
                assertEquals(somePerson.getGender(), Gender.MALE);

                somePerson.setGender(Gender.FEMALE);

                assertEquals(somePerson.getGender(), Gender.FEMALE);
                assertNotEquals(somePerson.getGender(), Gender.MALE);
        }

}