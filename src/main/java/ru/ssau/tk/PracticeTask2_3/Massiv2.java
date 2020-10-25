package ru.ssau.tk.PracticeTask2_3;

public class Massiv2 {
    public static int[] massiv(int size) {
        int[] massiv = new int[size];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = 2 * i + 1;
        }
        return massiv;
    }
}