package ru.ssau.tk.PracticeTask1_15;

abstract public class Operation {
    abstract double apply(double number);

    double applyTripple (double number){
        return apply(apply(apply(number)));
    }
}

