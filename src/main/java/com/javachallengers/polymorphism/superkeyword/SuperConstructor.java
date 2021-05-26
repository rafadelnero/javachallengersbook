package com.javachallengers.polymorphism.superkeyword;

public class SuperConstructor {
    public static void main(String[] args) {
        new Moe(); // It will print: Moe was created
    }

    static class Character {
        Character(String name) {
            System.out.println(name.concat(" was created"));
        }
    }

    static class Moe extends Character {
        Moe() {
            super("Moe");
        }
    }
}

