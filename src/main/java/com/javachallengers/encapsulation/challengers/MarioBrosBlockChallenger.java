package com.javachallengers.encapsulation.challengers;

public class MarioBrosBlockChallenger {

    {
        System.out.print("instance ");;
    }

    static {
        System.out.print("static ");;
    }

    MarioBrosBlockChallenger() {
        System.out.print("constructor ");;
    }

    public static void main(String... args) {
        System.out.print("Jump into ");
        new MarioBrosBlockChallenger();
        new MarioBrosBlockChallenger();
        System.out.print("blocks.");
    }
}
