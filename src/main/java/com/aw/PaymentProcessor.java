package com.aw;

public class PaymentProcessor {

        // Overloaded method 1
        void processPayment(int amount) {
            System.out.println("Processing payment of ₹" + amount + " (int version)");
        }
    
        // Overloaded method 2
        void processPayment(double amount, String currency) {
            System.out.println("Processing payment of " + amount + " " + currency + " (double, String version)");
        }
    
        // Overloaded method 3
        void processPayment(String upiId) {
            System.out.println("Processing payment via UPI ID: " + upiId + " (String version)");
        }
    
        public static void main(String[] args) {
            PaymentProcessor p = new PaymentProcessor();
    
            // Calling all overloaded methods
            p.processPayment(500);                      // int version
            p.processPayment(999.99, "USD");            // double, String version
            p.processPayment("avinash@upi");            // String version
    
            // Ambiguous call — uncomment to see compile-time error
            // p.processPayment(100, "INR"); // ❌ Compile-time error: reference to processPayment is ambiguous
        }
    }
