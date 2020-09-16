package ru.ssau.tk._Anastasia_._PROJECT_;

import java.util.Scanner;
public class Zadanie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа: ");
        int x = in.nextInt();//считывает первое число и присваивает значение в x
        int y = in.nextInt();//считывает второе число и присваивает значение в y
        int i = in.nextInt ();
        if ( i==1) {
            System.out.println (x + y);
        }
        else if (i==2) {
            System.out.println (x - y);
        }
        else if (i==3) {
            System.out.println (x * y);
        }

    }
}