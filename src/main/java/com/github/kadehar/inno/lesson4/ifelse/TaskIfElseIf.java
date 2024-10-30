package com.github.kadehar.inno.lesson4.ifelse;

import java.util.Scanner;

public class TaskIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number % 2 == 0 && number % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else if (number % 2 != 0 && number % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем.");
        } else if (number % 2 == 0) {
            System.out.println("Четное число.");
        }
        else {
            System.out.println("Нечетное число.");
        }
        scanner.close();
    }
}
