// File: DivisionDemo.java
package com.aw;

public class SelfStudy11 {
    public static void main(String[] args) {
        int a = 75;
        int b = 25; // Change this to a non-zero value to avoid exception

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Division complete");
        }
    }
}