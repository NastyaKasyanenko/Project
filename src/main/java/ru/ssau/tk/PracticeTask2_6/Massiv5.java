package ru.ssau.tk.PracticeTask2_6;

public class Massiv5 {
        public static int[] massiv(int size) {
            int[] massiv = new int[size];
            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = (int) Math.pow(i, 2);
            }
            return massiv;
        }
    }