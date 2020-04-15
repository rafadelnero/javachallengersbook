package com.javachallengers.chapter4.superkeyword;

public class SuperMethodExample {

    public static void main(String[] args) {
        new Homer().drinkBeer();
    }

    static class Character {
        void move(String name) {
            System.out.println(name.concat(" is walking..."));
        }
    }

    static class Homer extends Character {
        void drinkBeer() {
            super.move("Homer");
        }
    }

}

