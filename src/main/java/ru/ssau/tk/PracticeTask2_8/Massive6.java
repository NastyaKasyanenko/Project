package ru.ssau.tk.PracticeTask2_8;

public class Massive6 {
    public static double[] massiv(int size) {
        double[] massiv = new double[size];
        int j = 1;
        for (int i = 0; i < massiv.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            massiv[i] = j;
            j++;
        }
        return massiv;
    }
}