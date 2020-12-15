package ru.ssau.tk.PracticeTask4_7;

public class IncompatibleDimensionsException extends RuntimeException{
    public IncompatibleDimensionsException() {
        this("Матрицы несовместимы!");
    }

    public IncompatibleDimensionsException(String str) {
        System.out.println(str);

    }
}
