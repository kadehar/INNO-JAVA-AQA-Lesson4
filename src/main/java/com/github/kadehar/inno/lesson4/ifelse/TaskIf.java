package com.github.kadehar.inno.lesson4.ifelse;

import java.util.Scanner;

public class TaskIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int balance = scanner.nextInt();
        if (balance == 10) {
            System.out.println("Десятка");
        }
        scanner.close();
    }
}
