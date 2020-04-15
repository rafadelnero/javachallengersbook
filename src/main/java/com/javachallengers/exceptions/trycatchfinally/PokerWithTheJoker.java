package com.javachallengers.exceptions.trycatchfinally;

public class PokerWithTheJoker {

    public static void main(String... tryCatchFinally) {
        try {
            System.out.println("Batman calls the BatMobile");
            String remoteControl = null;
            remoteControl.equals("BatMobile");
        } catch (Exception exception) {
            System.out.println("The BatMobile takes a long time to arrive");
            exception.printStackTrace();
        } finally {
            System.out.println("Batman gets late for playing poker with the Joker");
        }
    }

}
