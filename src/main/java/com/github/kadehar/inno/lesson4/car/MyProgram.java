package com.github.kadehar.inno.lesson4.car;

public class MyProgram {
    public static void main(String[] args) {
        Car volkswagen = new Car("Beetle", "Volkswagen");
        int speed = volkswagen.getCurrentSpeed();
        System.out.println(speed);

        volkswagen.speedUp(25);
        speed = volkswagen.getCurrentSpeed();
        System.out.println(speed);

        volkswagen.brake();
        speed = volkswagen.getCurrentSpeed();
        System.out.println(speed);

        volkswagen.brake();
        speed = volkswagen.getCurrentSpeed();
        System.out.println(speed);

        volkswagen.brake();
        speed = volkswagen.getCurrentSpeed();
        System.out.println(speed);
    }
}
