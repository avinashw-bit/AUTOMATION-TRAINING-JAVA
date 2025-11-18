package com.aw;

// Simulating 'bank' package
class BankAccount {
    private double balance = 10000.50;
    protected String ifscCode = "BANK0001234";
    public String bankName = "Global Bank";

    public void showBalance() {
        System.out.println("Balance: ₹" + balance);
    }

    public void showIfscCode() {
        System.out.println("IFSC Code: " + ifscCode);
    }

    public void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Simulating 'customer' package without inheritance
class BranchCustomer {
    public void accessBankAccount() {
        BankAccount account = new BankAccount();

        // account.balance = 5000.0; // ❌ Error: balance is private
        // System.out.println(account.balance); // ❌ Error: balance is private

        // account.ifscCode = "NEWCODE"; // ❌ Error: ifscCode is protected
        // System.out.println(account.ifscCode); // ❌ Error: ifscCode is protected

        account.bankName = "Updated Bank"; // ✅ public access
        System.out.println("Bank Name (public): " + account.bankName);

        account.showBalance();   // ✅ public method
        account.showIfscCode();  // ✅ public method
        account.showBankName();  // ✅ public method
    }
}

// Simulating 'customer' package with inheritance
class BranchCustomerInherited extends BankAccount {
    public void accessInheritedAccount() {
        // balance = 5000.0; // ❌ Error: balance is private
        // System.out.println(balance); // ❌ Error: balance is private

        ifscCode = "INHERITEDCODE"; // ✅ protected access via inheritance
        System.out.println("IFSC Code (protected): " + ifscCode);

        bankName = "Inherited Bank"; // ✅ public access
        System.out.println("Bank Name (public): " + bankName);

        showBalance();   // ✅ public method
        showIfscCode();  // ✅ public method
        showBankName();  // ✅ public method
    }
}

// Main class to run the demo
public class AccessDemo {
    public static void main(String[] args) {
        System.out.println("Access without inheritance:");
        BranchCustomer customer = new BranchCustomer();
        customer.accessBankAccount();

        System.out.println("\nAccess with inheritance:");
        BranchCustomerInherited inheritedCustomer = new BranchCustomerInherited();
        inheritedCustomer.accessInheritedAccount();
    }
}