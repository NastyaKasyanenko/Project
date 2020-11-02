package ru.ssau.tk.PracticeTask2_18;

public class Massiv15 {
    static Integer massiv(int[] massiv) {
        if (massiv.length == 0) {
            return null;
        }
        int cout = 0;
        for (int i : massiv) {
            if (massiv[i + 1] > massiv[i]) {
                cout = massiv[i + 1];
            }
        }
        return cout;
    }
}
