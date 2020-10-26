package ru.ssau.tk.PracticeTask2_4;

public class Massiv3 {
    public static int[] massiv(int size) {
        int fullSize = 2 * size;
        int[] massiv = new int[fullSize];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = fullSize;
            fullSize -= 2;
        }
        return massiv;
    }
}