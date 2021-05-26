package com.javachallengers.polymorphism.defaultconstructor;

public class NonParameterizedConstructorSuper {

    public static void main(String... nonParameterizedConstructor) {
        new Moe();
    }

    static class Character {
        Character() {
            System.out.println("A Character was created");
        }

        Character(String name) {
            System.out.println(name + "was created");
        }
    }

    static class Moe extends Character {
        // It’s not necessary to add super here since the JVM adds super automatically
        // when there is a constructor with no parameters in the parent class
    }

}
