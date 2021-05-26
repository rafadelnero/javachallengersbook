package com.javachallengers.polymorphism.finalinheritance;

public class NonFinalMethodWorking {
    class Character { void performAction() { }}
    class Homer extends Character {
        void performAction() { }
    }

}
