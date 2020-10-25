package ru.ssau.tk.PracticeTask2_2;

public class Massiv1 {
    public static int[] massiv(int size) {
        int[] massiv = new int[size];
        massiv[0] = 2;
        massiv[size - 1] = 2;
        for (int i = 1; i < massiv.length - 1; i++) {
            massiv[i] = 1;
        }
        return massiv;
    }
}

