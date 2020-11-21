package ru.ssau.tk.PracticeTask3_4;

public class Stroki3 {
    static boolean stroka(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}