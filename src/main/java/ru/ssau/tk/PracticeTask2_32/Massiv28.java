package ru.ssau.tk.PracticeTask2_32;

import java.util.Arrays;

public class Massiv28 {
    static void sort(Double[] array) {
        for (Double j : array) {
            if (j.isNaN()) {
                return;
            } else {
                Arrays.sort(array);
            }
        }
    }
}
