package com.javachallengers.polymorphism.isanobject;

public class TheHiddenModifier {

    public static void main(String... doYourBest) {
        System.out.println(new TheHiddenModifier());
        var hiddenModifier = new TheHiddenModifier();
        System.out.println(hiddenModifier.equals(hiddenModifier));
    }

   /* @Override
    String toString() { // Line 12 It won't compile because of the modifier
        return "theHiddenModifier";
    }*/

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj); // Line 18
    }
}
