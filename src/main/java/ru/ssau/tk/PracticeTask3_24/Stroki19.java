package ru.ssau.tk.PracticeTask3_24;

import java.nio.charset.Charset;

public class Stroki19 {
    public static void changeCharsetStr(String str, Charset CharSet1, Charset charSet2){
        String str2 = new String(str.getBytes(CharSet1), charSet2);
        System.out.println(str2);
    }
}
