package ru.ssau.tk._Anastasia_._PROJECT_;

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {
        String choice, choice1 = "triangle", choice2 = "rectangle", choice3 = "circle";
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 1; ) {
            System.out.println("Please write your choice");
            choice = in.nextLine();
            if (choice.equals(choice1)) {
                System.out.println("Введите ширину треугольника: ");
                double base = in.nextDouble();
                System.out.println("Введите высоту треугольника: ");
                double height = in.nextDouble();
                double area = (base * height) / 2;
                System.out.println("Площадь треугольника равна: " + area);
                i++;
            } else if (choice.equals(choice2)) {
                System.out.println("Введите длину прямоугольника: ");
                double num1 = in.nextDouble();
                System.out.println("Введите ширину прямоугольника: ");
                double num2 = in.nextDouble();
                double area = (num1 * num2);
                System.out.println("Площадь треугольника равна: " + area);
                i++;

            } else if (choice.equals(choice3)) {
                System.out.println("Введите радиус круга: ");
                double radius = in.nextDouble();
                double area = (radius * radius * Math.PI);
                System.out.println("Площадь треугольника равна: " + area);
                i++;
            }
        }
    }
}
