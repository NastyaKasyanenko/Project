package ru.ssau.tk.PracticeTask3_6;

public class Stroki5 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Символ \t№" + ++i);
        System.out.println("Символ \b№" + ++i);
        System.out.println("Символ \n№" + ++i);
        System.out.println("Символ \r№" + ++i);
        System.out.println("Символ \'№" + ++i);
        System.out.println("Символ \"№" + ++i);
        System.out.println("Символ\\№" + ++i);

    }
}
//чтобы программа поняла, что после слеша идет какая-то команда, без \ она не поймет, что делать