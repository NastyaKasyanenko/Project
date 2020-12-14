package ru.ssau.tk.PracticeTask4_3;

public class Exception2 {
    public static char getCharString(String[] arrayStr, int n, int m) {
        if (n > arrayStr.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (m > arrayStr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arrayStr[n].charAt(m);
    }
}
