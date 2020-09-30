package ru.ssau.tk._Anastasia_._PROJECT_;

public class trialcode {
    public static void main(String[] args) {

        System.out.println(multiply(2, 3));
        System.out.println(multiply(4.6, 5.5));
        System.out.println(multiply(4, 3, 6));
    }
    static int multiply(int x, int y){

        return x * y;
    }
    static double multiply(double x, double y){

        return x * y;
    }
    static int multiply(int x, int y, int z){

        return x * y * z;
    }
}
