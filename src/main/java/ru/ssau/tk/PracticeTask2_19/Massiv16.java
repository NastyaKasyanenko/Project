package ru.ssau.tk.PracticeTask2_19;

public class Massiv16 {
    static int Array(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                summa += array[i];
            }
        }
        return summa;
    }
}