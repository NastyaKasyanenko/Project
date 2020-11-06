package ru.ssau.tk.PracticeTask2_20;

public class Massiv17 {
    static boolean Array(int[] array) {
        int count1 = 0;
        int count2 = 0;
        for (int j : array) {
            if (j % array[0] == 0)
                count1++;
        }
        for (int i : array) {
            if (i % array[array.length - 1] == 0)
                count2++;
        }
        return count1 > count2;
    }
}