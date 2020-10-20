package ru.ssau.tk.PracticeTask1_18;

public class IntGeneratorImpl implements  IntGenerator{
    private int x = 0;
    @Override
    public int nextInt() {
        return x++;
    }
}
