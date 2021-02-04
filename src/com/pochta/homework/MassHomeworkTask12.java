package com.pochta.homework;

import java.util.Random;
import java.util.Scanner;

public class MassHomeworkTask12 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int masslength = scanner.nextInt();
        int mass[] = new int[masslength];
        Random random = new Random();

        for (int i = 0; i < masslength; i++) {
            mass[i] = random.nextInt(98);

        }
        System.out.println("Введите число для поиска в массиве");
        int number = scanner.nextInt();

        for (int element : mass) {
            if (element == number) {
                System.out.println(element);
            }
        }
        int max = mass[0];
        for (int element: mass) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Максимальное значение - " + max);
    }
}
