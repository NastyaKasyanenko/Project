package ru.ssau.tk.PracticeTask1_18;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int x = 0;
    String name = "Absent";

    @Override
    public int nextInt() {
        return x++;
    }

    @Override
    public void reset() {
        x = 0;
    }

    public String getName() {

        return name;
    }
}