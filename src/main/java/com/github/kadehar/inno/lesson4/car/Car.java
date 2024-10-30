package com.github.kadehar.inno.lesson4.car;

public class Car {
    private final String model;
    private final String brand;
    private int currentSpeed;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void speedUp(int speed) {
        currentSpeed = speed;
    }

    public void brake() {
        if (currentSpeed <= 10) {
            currentSpeed = 0;
            return;
        }
        currentSpeed -= 10;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
