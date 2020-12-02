package ru.ssau.tk.PracticeTask3_21;

public class Stroki16 {
    public static void main(String[] args) {
        String str = "I am very happy";
        StringBuilder strBldr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBldr.replace(i, i + 1, i + "");
            }
        }

        strBldr.reverse();
        System.out.println(strBldr.toString());
    }
}