package ru.ssau.tk.PracticeTask3_12;

public class Stroki11 {
    static String metod(String str1, String str2, String str3) {
        for (int i = 0; i < 100 && str1.contains(str2); i++) {
            str1 = str1.replaceAll(str2, str3);
        }
        return str1;
    }
}
