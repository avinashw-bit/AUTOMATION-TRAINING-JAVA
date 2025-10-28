package com.aw;

public class ModelOverloadingCalculator {

    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method 3: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(2, 3));
        System.out.println("add(double, double): " + calc.add(2.5, 3.7));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
    }
}
