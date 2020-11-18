package ru.ssau.tk.PracticeTask3_2;

public class Stroki1 {
    public void getStr(String str){
        byte[] bytes = str.getBytes();
        for (byte byt:bytes) {
            System.out.println(byt);
        }
    }
}
