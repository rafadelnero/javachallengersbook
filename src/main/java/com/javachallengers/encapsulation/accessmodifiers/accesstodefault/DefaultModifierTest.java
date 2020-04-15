package com.javachallengers.encapsulation.accessmodifiers.accesstodefault;

public class DefaultModifierTest {

    public static void main(String[] args) {
        DefaultModifier defaultModifier = new DefaultModifier();
        System.out.println(defaultModifier.defaultAttribute);
        defaultModifier.print();
    }
}
