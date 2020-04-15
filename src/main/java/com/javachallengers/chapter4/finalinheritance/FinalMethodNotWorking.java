package com.javachallengers.chapter4.finalinheritance;

public class FinalMethodNotWorking {
}

class Character { final void performAction() { }}
class Homer extends Character {
    //void performAction() { }
}
