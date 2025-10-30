package com.aw;

public class Car {
    // Attributes
    String brand;
    String model;
    double price;

    // Parameterized constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }
}


