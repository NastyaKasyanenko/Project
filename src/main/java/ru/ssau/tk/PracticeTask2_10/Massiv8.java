package ru.ssau.tk.PracticeTask2_10;

public class Massiv8 {
    static double[] GeometricProgression(double firstElement, double step, int dim) {
        double[] GeometricProgression = new double[dim];
        GeometricProgression[0] = firstElement;
        for(int i = 1; i < dim; i++) {
            GeometricProgression[i] = GeometricProgression[i-1]*step;
        }
        return GeometricProgression;
    }
}
