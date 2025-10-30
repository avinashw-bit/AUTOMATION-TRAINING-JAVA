package com.aw;

// Car class
class Car {
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }
}

// Main class
public class SelfStudy7 {
    public static void main(String[] args) {
        Car car1 = new Car("Kia", "Seltos", 1200000);
        Car car2 = new Car("Skoda", "Kushaq", 1500000);

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}

