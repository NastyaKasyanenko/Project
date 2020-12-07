package ru.ssau.tk.PracticeTask4_1;

import ru.ssau.tk.PracticeTask1_2.Person;

public class Exception {
    public static String objectPerson(Person obj) {
        if (obj.getfirstName() == null || obj.getlastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
