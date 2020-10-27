package ru.ssau.tk.PracticeTask2_9;

public class Massiv7 {
    public static double[] progress(int size, int first, int difference) {
        double[] progress = new double[size];
        for (int i = 0; i != progress.length; i++) {
            progress[i] = first + i * difference;
        }
        return progress;
    }
}
