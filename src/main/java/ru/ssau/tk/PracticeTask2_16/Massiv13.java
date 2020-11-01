package ru.ssau.tk.PracticeTask2_16;

public class Massiv13 {
    static boolean massiv(Integer[] massiv) {
        for (int i : massiv) {
            if (massiv[i] == null) {
                return true;
            }
        }
        return false;
    }
}

