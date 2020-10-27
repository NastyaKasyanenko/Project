package ru.ssau.tk.PracticeTask2_5;

public class Massiv4 {
    public static int[] massiv(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}

