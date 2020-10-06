package ru.ssau.tk.PracticeCheck13and14;
import ru.ssau.tk.PracticeTask1_2.Person;
public class Check {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getfirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }
    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getfirstName());
    }
}
