package com.aw;

public class BankAccountClass {

    // Fields
    String accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("----------------------");
    }

    // Main method to demonstrate deposit and withdraw
    public static void main(String[] args) {
        BankAccountClass account = new BankAccountClass();
        account.accountNumber = "ICICI000124578";
        account.balance = 124589.00;

        account.printDetails();

        account.deposit(2500.00);
        account.withdraw(4000.00);

        account.printDetails();
    }
}