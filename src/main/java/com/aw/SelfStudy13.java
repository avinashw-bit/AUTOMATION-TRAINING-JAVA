// File: SelfStudy13.java
package com.aw;

import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class to test
public class SelfStudy13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible for driving license");
            } else {
                System.out.println("You are eligible for a driving license.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Age verification complete.");
        }

        scanner.close();
    }
}
