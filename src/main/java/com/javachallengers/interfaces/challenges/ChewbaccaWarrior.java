package com.javachallengers.interfaces.challenges;

public class ChewbaccaWarrior implements Warrior {

    public static void main(String... doYourBest) {
        pilotShip();
        new ChewbaccaWarrior().attack();
    }

    public void run() {
        System.out.println("Chewbacca is running");
    }

    static void pilotShip() {
        System.out.println("Chewbacca pilots the ship");
    }
}


interface Warrior extends Brave {
    int attackForce = 99999;

    default void attack() {
        System.out.println("Warrior attack:" + attackForce);
        run();
        Brave.super.attack();
    }

    static void pilotShip() {
        System.out.println("Warrior pilots the ship");
    }

    void run();
}

interface Brave {
    default void attack() {
        System.out.println("Brave attack");
    }
}
