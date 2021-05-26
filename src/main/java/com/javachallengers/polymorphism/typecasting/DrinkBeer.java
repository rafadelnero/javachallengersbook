package com.javachallengers.polymorphism.typecasting;

public class DrinkBeer {
    public static void main(String... drinkBeer) {
        drinkBeer(new Homer());
    }

    static void drinkBeer(Character character) {
        // Ok JVM, I will make you happy and will cast Character to Homer
        Homer homer = (Homer) character;
        homer.drinkBeer();
    }

    static class Character {
    }

    static class Homer extends Character {
        void drinkBeer() {
            System.out.println("Homer drinks a beer");
        }
    }
}

