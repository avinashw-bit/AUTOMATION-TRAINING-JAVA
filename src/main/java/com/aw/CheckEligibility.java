package com.aw;

public class CheckEligibility {

    // Method to check eligibility
    public static boolean isEligible(int age) {
        if (age >= 18) {
            return true;   // eligible
        } else {
            return false;  // not eligible
        }
    }

    public static void main(String[] args) {
        System.out.println("Age 17 Eligible? " + isEligible(17)); // false
        System.out.println("Age 19 Eligible? " + isEligible(19)); // true
        System.out.println("Age 24 Eligible? " + isEligible(24)); // true
    }
}
