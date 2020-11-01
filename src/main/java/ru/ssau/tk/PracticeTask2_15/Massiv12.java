package ru.ssau.tk.PracticeTask2_15;

public class Massiv12 {
    static boolean massiv(int[] massiv, int number) {
        for (int i : massiv) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}