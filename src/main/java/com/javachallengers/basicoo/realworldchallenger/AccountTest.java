package com.javachallengers.basicoo.realworldchallenger;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println("The balance is 1000.0: " + account.getBalance());

        account.withdraw(100);
        System.out.println("The balance is 900.0: " + account.getBalance());

        account.withdraw(1000);
        System.out.println("The balance is 900.0: " + account.getBalance());

        account.deposit(-100);
        System.out.println("The balance is 900.0: " + account.getBalance());

        account.withdraw(900);
        System.out.println("The balance is 0: " + account.getBalance());
    }
}
