package com.javachallengers.polymorphism.challengers;

public class InheritanceFinalChallenge {
    private static int damage;
    public static void main(String... doYourBest) {
        Character ironMan = new IronMan();
        ironMan.attack();
        ((IronMan)ironMan).protonCannon();
        Character character = new SpiderMan();
        character.attack();
        System.out.println(damage);
        ((IronMan)character).protonCannon();
    }
    static abstract class Character {
        Character() {
            damage++;
        }
        abstract void attack();
    }
    static class IronMan extends Character {
        Armor armor = new Armor();
        void protonCannon() {
            System.out.println("Boom!");
        }
        void attack() {
            armor.standingLight();
        }
    }
    static class Armor {
        void standingLight() {
            System.out.println("--->>>");
        }
    }
    static class SpiderMan extends Character {
        void attack() {
            new SpiderMan();
            System.out.println("Spider-Web!");
        }
    }
}
