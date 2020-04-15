package com.javachallengers.chapter4.multipleinheritance;

public class InterfaceInheritance {

    interface Human { void talk(); }
    interface Hero { void rescue(Human human); }

    interface Batman extends Hero, Human {}
}


