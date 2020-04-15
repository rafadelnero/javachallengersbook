package com.javachallengers.encapsulation.accessmodifiers;

import com.javachallengers.encapsulation.accessmodifiers.accesstoprotected.ProtectedModifier;

// We are using inheritance when we are extending the ProtectedModifier class
public class ProtectedModifierOutsidePackage extends ProtectedModifier {

    public static void main(String[] args) {
        ProtectedModifier protectedModifier = new ProtectedModifier();
        // protectedModifier.print(); We can't access it here without inheritance

        // We are using inheritance here
        ProtectedModifierOutsidePackage outsidePackage = new ProtectedModifierOutsidePackage();
        outsidePackage.print(); // Since we are using inheritance here, we have access to the method
        System.out.println(outsidePackage.protectedAttribute); // We also have access to the attribute
    }
}
