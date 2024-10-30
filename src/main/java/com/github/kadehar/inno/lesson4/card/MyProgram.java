package com.github.kadehar.inno.lesson4.card;

public class MyProgram {
    public static void main(String[] args) {
        Card testCard = new Card(
                "1244 5500 9999 8877",
                "11/79",
                "045",
                1245
        );

        System.out.println("Печать карты с маской:");
        testCard.printCardNumberSecure();
        System.out.println("Печать карты с верным пин кодом:");
        testCard.printCardNumber(1245);
        System.out.println("Печать карты с неверным пин кодом:");
        testCard.printCardNumber(1246);
    }
}
