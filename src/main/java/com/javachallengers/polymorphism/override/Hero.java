package com.javachallengers.polymorphism.override;

class Hero {
    void usePower() {
        System.out.println("The hero is going to use his power!");
    }
}

class SpiderMan extends Hero {
}

class Wolverine extends Hero {
    @Override
    void usePower() {
        System.out.println("Fatal Claw");
    }
}
