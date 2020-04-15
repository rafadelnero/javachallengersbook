package com.javachallengers.basicoo.realworldchallenger;

class Account {

    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void transfer(double transferAmount, Account recipient) {
        if (transferAmount > balance) {
            System.out.println("The amount exceeds the balance");
        } else {
            this.balance -= transferAmount;
            recipient.balance += transferAmount;
        }
    }

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Negative numbers are not accepted");
        } else {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("The amount exceeds the balance");
        } else {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}
