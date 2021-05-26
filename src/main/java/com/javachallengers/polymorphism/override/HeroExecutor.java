package com.javachallengers.polymorphism.override;

public class HeroExecutor {

    public static void main(String... methodOverridingExample) {
        Hero hero = new Hero();
        hero.usePower(); // The hero is going to use his power! will be printed
        Hero spiderMan = new SpiderMan();
        spiderMan.usePower(); // The hero is going to use his power! will be printed
        Hero wolverine = new Wolverine();
        wolverine.usePower(); // Fatal Claw will be printed
    }
}
