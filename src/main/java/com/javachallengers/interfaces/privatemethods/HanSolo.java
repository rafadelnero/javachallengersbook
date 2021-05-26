package com.javachallengers.interfaces.privatemethods;

public interface HanSolo {

    default void shootWithABlaster() {
        String weapon = "Blaster";
        shoot(weapon);
    }

    default void shootWithABowcaster() {
        String weapon = "Bowcaster";
        shoot(weapon);
    }

    private void shoot(String weapon) {
        System.out.println("Choose the weapon:" + weapon);
        System.out.println("Get the " + weapon);
        System.out.println("Aim the " + weapon);
        System.out.println("Shoot with the " + weapon);
    }

}
