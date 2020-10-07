package ru.ssau.tk._Anastasia_._PROJECT_;
import java.util.Scanner;
public class Area {
    public static void main(String args[]) {
        String choice, choice1 = "triangle" , choice2 = "rectangle", choice3 = "circle";
            Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your choice");
        choice = in.nextLine();
        System.out.println("Your name is:");
        System.out.println(choice);
            System.out.println("Введите ширину треугольника: ");
            double base = scanner.nextDouble();

            System.out.println("Введите высоту треугольника: ");
            double height = scanner.nextDouble();
            double area = (base* height)/2;
            System.out.println("Площадь треугольника равна: " + area);
        }
}
