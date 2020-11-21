package ru.ssau.tk.PracticeTask3_3;

public class Stroki2 {
    public static void main(String[] args) {
        String str = "I am happy";
        String str1 = new String(str);
        String str2 = "I am happy";
        if(str==str2){
            System.out.println("str==str2");
        }
        if (str == str1) {
            System.out.println("str==str1");
        }
        if (str.equals(str1)) {
            System.out.println("str.equals(str1)");
        }
    }
}
