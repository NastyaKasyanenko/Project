package ru.ssau.tk.PracticeTask2_30;

public class Massiv27 {
    static int[][] vector(int size) {
        int[][] arr = new int[size][];
        int k = 1;
        for (int i = 0; i < size; i++) {
            arr[i] = new int[size - i];
            for (int j = 0; j < size - i; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        return arr;
    }
}
