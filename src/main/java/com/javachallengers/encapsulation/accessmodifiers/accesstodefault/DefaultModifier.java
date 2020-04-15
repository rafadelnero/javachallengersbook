package com.javachallengers.encapsulation.accessmodifiers.accesstodefault;

class DefaultModifier {

    // This attribute can only be accessed inside the accesstodefault package
    String defaultAttribute;

    // We don't declare explicitly that we are using the default access modifier.
    // If we are not using public, protected or private we are using the default access modifier.
    void print() {
        System.out.println("This method can only be accessed inside the accesstodefault package");
    }

}
