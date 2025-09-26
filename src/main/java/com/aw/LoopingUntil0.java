package com.aw;
public class LoopingUntil0 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number (0 to exit): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid integer: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num != 0);
        scanner.close();
        System.out.println("Done");
    }
}
