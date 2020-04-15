package com.javachallengers.basicoo.challengers;

public class MetalGearReference {

    String name;

    public static void main(String... doYourBest) {
        MetalGearReference solidSnake = new MetalGearReference();
        solidSnake.changeSoldierName(solidSnake, "Solid Snake");

        MetalGearReference liquidSnake = new MetalGearReference();
        liquidSnake.changeSoldierName(liquidSnake, "Liquid Snake");

        System.out.println("1 soldier=" + solidSnake.name + " 2 soldier=" + liquidSnake.name);
    }

    void changeSoldierName(MetalGearReference metalGearReference, String name) {
        metalGearReference.name = name;
        this.name = "Big Boss";

        metalGearReference = null;
    }

}
