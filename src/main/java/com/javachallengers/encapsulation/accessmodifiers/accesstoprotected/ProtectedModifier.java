package com.javachallengers.encapsulation.accessmodifiers.accesstoprotected;

public class ProtectedModifier {

    protected String protectedAttribute;

    protected void print() {
        System.out.println("Protected method! This method is accessible in this package or" +
                " outside with inheritance");
    }
}
