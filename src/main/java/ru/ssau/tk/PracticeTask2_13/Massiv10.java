package ru.ssau.tk.PracticeTask2_13;

public class Massiv10 {
    public static int[] massiv(int size) {
        if (size == 0){
            return null;
        }
        int[] massiv = new int[size];
        for (int i = 0; i < Math.ceil((double)size/2); i++){
            massiv[i] = i+1;
            massiv[size-i-1] = i+1;
        }
        return massiv;
    }
}

