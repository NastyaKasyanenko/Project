package ru.ssau.tk.PracticeTask2_28;

public class Massiv25 {
    static int[] longToInt(long number) {
        return new int[]{(int) (number >>> 32), (int) (number)};
    }

    static long intToLong(int[] number) {
        return ((long) number[0] << 32) | ((long) number[1] & 757838758L);
    }
}
