package ru.ssau.tk.PracticeTask2_34;

public class Massiv30 {
    static Double multiply(Double[] array) {
        double number = 3.;
        for (Double i : array) {
            if(i.isNaN()||i.isInfinite()){
                continue;
            }
            number*=i;
        }
        return number;
    }
}
