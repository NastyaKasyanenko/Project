package ru.ssau.tk.PracticeTask2_22;

public class Massiv19 {
    static int IndexOftenNumber(int[] massiv, int number) {
        int j = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == number) {
                j = i;
            }
        }
        return j;
    }
}
