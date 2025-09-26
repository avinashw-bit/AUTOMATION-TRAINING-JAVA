package com.aw;

public class FirstEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 10, 12, 15, 18, 21, 24};

        System.out.println(" Printing numbers till first even number is found: ");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number is: " + number);
                break; // stop after finding the first even number
            }
        }
    } // closes main
} // closes class

