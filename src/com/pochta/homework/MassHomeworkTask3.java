package com.pochta.homework;

import java.util.Scanner;

public class MassHomeworkTask3 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Выберете операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком ");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                int result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            case 3:
                result = firstNumber / secondNumber;
                System.out.println(result);
                break;
            case 4:
                result = firstNumber % secondNumber;
                System.out.println(result);
                break;
        }
    }
}
