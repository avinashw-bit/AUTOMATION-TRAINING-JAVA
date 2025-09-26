package com.aw;

public class Mobile {

    // Fields
    String brand;
    double price;

    // Method to print details
    void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Create first mobile
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Samsung Galaxy A52";
        mobile1.price = 29999.00;

        // Create second mobile
        Mobile mobile2 = new Mobile();
        mobile2.brand = "iPhone 17 Pro";
        mobile2.price = 149900.00;

        // Show details
        mobile1.printDetails();
        mobile2.printDetails();
    }
}
