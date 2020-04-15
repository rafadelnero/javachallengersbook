package com.javachallengers.chapter4.typecasting;

public class SubclassToSuperClass {

    public static void main(String... args) {
        Barney barney = new Barney();
        Character characterBarney = barney; // That works perfectly
    }

    static class Character { }
    static class Barney extends Character { }

}
