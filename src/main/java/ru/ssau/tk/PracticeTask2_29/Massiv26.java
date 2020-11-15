package ru.ssau.tk.PracticeTask2_29;

public class Massiv26 {
    static int[] Array(int size, int indexBegining) {
        if (indexBegining >= size) {
            return null;
        } else {
            int[] cout = new int[size];
            for (int i = 0; i < size; i++) {
                cout[i + indexBegining - (i + indexBegining >= size ? size : 0)] = i + 1;
            }
            return cout;
        }
    }
}
