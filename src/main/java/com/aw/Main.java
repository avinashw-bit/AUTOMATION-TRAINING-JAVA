package com.aw;

class BankAccount {
    double getInterestRate() {
        return 0.0;  // Default rate
    }
}

class SavingsAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 4.0;
    }
}

class CurrentAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 2.0;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = { new SavingsAccount(), new CurrentAccount() };

        for (BankAccount acc : accounts) {
            System.out.println("Interest Rate: " + acc.getInterestRate() + "%");
        }
    }
}
