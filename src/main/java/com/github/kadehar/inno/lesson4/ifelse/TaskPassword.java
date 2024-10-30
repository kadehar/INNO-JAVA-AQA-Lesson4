package com.github.kadehar.inno.lesson4.ifelse;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        System.out.println(checkPassword(password));
        scanner.close();
    }

    private static String checkPassword(String password) {
        if (password.length() < 8) {
            return "Пароль не менее 8 символов";
        }
        if (password.chars().noneMatch(Character::isDigit)) {
            return "Пароль должен содержать минимум 1 цифру";
        }
        if (!hasSpecialChars(password)) {
            return "Пароль должен содержать минимум 1 спецсимвол";
        }
        return "Пароль принят";
    }

    private static boolean hasSpecialChars(String password) {
        Pattern special = Pattern.compile("[!@#$%^&*№]");
        Matcher hasSpecial = special.matcher(password);
        return hasSpecial.find();
    }
}
