package ru.ssau.tk.PracticeTask2_27;

public class Massiv24 {
    static boolean[] massiv(int[] array) {
        boolean[] array1 = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] % 2 == 0;
        }
        return array1;
    }
}
