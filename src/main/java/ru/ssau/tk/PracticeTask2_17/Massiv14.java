package ru.ssau.tk.PracticeTask2_17;

public class Massiv14 {
    static int number(int[] massiv) {
        int j = 0;
        for (int i : massiv) {
            if (massiv[i] % 2 == 0) {
                j++;
            }
        }
        return j;
    }
}
