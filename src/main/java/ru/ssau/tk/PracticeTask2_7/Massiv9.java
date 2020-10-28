package ru.ssau.tk.PracticeTask2_7;

public class Massiv9 {
    public static double[] number(double a, double b, double c) throws Exception {
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    throw new Exception("Решений нет");
                } else {
                    throw new Exception("Решение - комлпексное число");
                }
            } else {
                return new double[]{-c / b};
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                return new double[]{(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
            } else if (d == 0) {
                return new double[]{-b / (2 * a)};
            } else {
                throw new NullPointerException("Решение - вещественное число");
            }
        }
    }
}