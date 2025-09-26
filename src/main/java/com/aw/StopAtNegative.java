package com.aw;

public class StopAtNegative {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter up to 10 integers (negative number will stop input):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Negative number entered. Stopping input.");
                break; // stop the loop if number is negative
            }
        }

        sc.close();
    }
}

