package com.javachallengers.basicoo.realworldchallenger;

public class TransferTest {

    public static void main(String[] args) {
        Account origin = new Account(1000);
        Account recipient = new Account(1000);

        origin.transfer(100, recipient);
        System.out.println("The origin should have 900: " + origin.getBalance());
        System.out.println("The recipient should have 1100: " + recipient.getBalance());

        origin.transfer(1000, recipient);
        System.out.println("The origin should have 900: " + origin.getBalance());
        System.out.println("The recipient should have 1100: " + recipient.getBalance());
    }

}
