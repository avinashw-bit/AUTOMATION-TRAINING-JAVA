package com.aw;
public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(15, 30);               // Calls add(int, int)
        double sum2 = calc.add(5.5d, 4.5d);        // Calls add(double, double)
        int sum3 = calc.add(1, 2, 3);              // Calls add(int, int, int)

        System.out.println("Sum of 15 and 30: " + sum1);
        System.out.println("Sum of 5.5 and 4.5: " + sum2);
        System.out.println("Sum of 1, 2 and 3: " + sum3);
    }
}




