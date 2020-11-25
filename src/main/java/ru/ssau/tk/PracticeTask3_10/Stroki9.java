package ru.ssau.tk.PracticeTask3_10;

public class Stroki9 {
    static int set(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str: array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
