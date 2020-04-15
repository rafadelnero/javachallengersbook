package com.javachallengers.encapsulation.accessmodifiers;

import com.javachallengers.encapsulation.accessmodifiers.accesstopublic.PublicModifier;

public class PublicModifierTest {

    public static void main(String[] args) {
        PublicModifier publicModifier = new PublicModifier();
        publicModifier.thisMethodIsOpenedToBeAccessed();
        System.out.printf(publicModifier.publicAttribute);
    }
}
