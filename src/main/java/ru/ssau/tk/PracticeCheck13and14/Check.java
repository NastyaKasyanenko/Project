package ru.ssau.tk.PracticeCheck13and14;
import ru.ssau.tk.PracticeTask1_2.Person;
public class Check {
    public static void main(String[] args) {
        Person person = new Person();/*Создала объект в среде main*/
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getfirstName());/*Вывела объект в main*/
    }

    private static void checkAnotherPerson(Person person) {
        /*объект не используется, как есть новый инициализированный объект */
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getfirstName());/*Значение*/
    }
}