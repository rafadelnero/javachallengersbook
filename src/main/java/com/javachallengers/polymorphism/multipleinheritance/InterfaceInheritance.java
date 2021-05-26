package com.javachallengers.polymorphism.multipleinheritance;

public class InterfaceInheritance {

    interface Human { void talk(); }
    interface Hero { void rescue(Human human); }

    interface Batman extends Hero, Human {}
}


