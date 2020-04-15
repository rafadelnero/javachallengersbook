package com.javachallengers.encapsulation.accessmodifiers.accesstoprivate;

public class PrivateModifier {

    // This attribute can only be used within the PrivateModifier class
    private String privateAttribute;

    private void print() {
        System.out.println("This method can only be accessed inside the PrivateModifier class");
    }

}
