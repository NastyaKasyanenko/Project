package ru.ssau.tk.PracticeTask3_22;

public class Stroki17 {
    static String getStringOfNumber(int cout) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < cout; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
