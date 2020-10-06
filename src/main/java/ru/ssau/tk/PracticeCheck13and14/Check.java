package ru.ssau.tk.PracticeCheck13and14;
import ru.ssau.tk.PracticeTask1_2.Person;
public class Check {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getfirstName());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getfirstName());
    }
}