package com.javachallengers.polymorphism.defaultconstructor;

public class CustomizedConstructorSuper {

    public static void main(String... customizedConstructor) {
        new Moe();
    }

    static class Character {
        Character(String name) {
            System.out.println(name + " was invoked");
        }
    }

    static class Moe extends Character {
        // We will have compilation error if we don't invoke the constructor explicitly
        Moe () {
            super("Moe Szyslak");
        }
    }

}
