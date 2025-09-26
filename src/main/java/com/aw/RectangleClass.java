package com.aw;

public class RectangleClass {

    // Fields
    double length;
    double width;

    // Method to calculate area
    double area() {
        return length * width;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + width);
    }

    // Main method inside the same class
    public static void main(String[] args) {
        // Create rectangle object
        RectangleClass rect = new RectangleClass();
        rect.length = 10.0;
        rect.width = 6.0;

        // Print area and perimeter
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}


