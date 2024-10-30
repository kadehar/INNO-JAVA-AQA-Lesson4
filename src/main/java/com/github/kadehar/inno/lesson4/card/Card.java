package com.github.kadehar.inno.lesson4.card;

public class Card {
    private final String number;
    private final String expireDate;
    private final String cvv;
    private final int pin;

    public Card(String number, String expireDate, String cvv, int pin) {
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.pin = pin;
    }

    public void printCardNumber(int pin) {
        if (this.pin != pin) {
            printCardNumberSecure();
            return;
        }
        System.out.println(mask("XXXX XXXX XXXX XXXX"));
    }

    public void printCardNumberSecure() {
        System.out.println(mask("**** **** **** XXXX"));
    }

    private String mask(String mask) {
        String card = number.replaceAll(" ", "");
        int maskLength = mask.length();
        int index = 0;
        StringBuilder maskedCard = new StringBuilder();
        for (int i = 0; i < maskLength; i++) {
            char symbol = mask.charAt(i);
            if (symbol == 'X') {
                maskedCard.append(card.charAt(index));
                index++;
            } else if (symbol == '*') {
                maskedCard.append(symbol);
                index++;
            } else {
                maskedCard.append(symbol);
            }
        }
        return maskedCard.toString();
    }
}
