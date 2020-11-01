package ru.ssau.tk.PracticeTask2_17;

public class Massiv14 {
    static int numberEven(int[] array) {
        int j = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                j++;
            }
        }
        return j;
    }
}
