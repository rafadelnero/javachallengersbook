package com.javachallengers.interfaces.staticmethod;

public class StarWarsWarrior {

    public static void main(String... staticMethodOnInterfaces) {
        Chewbacca.roar();
    }

}

interface Chewbacca {

    static void roar() {
        System.out.println("Roar!");
    }

}
