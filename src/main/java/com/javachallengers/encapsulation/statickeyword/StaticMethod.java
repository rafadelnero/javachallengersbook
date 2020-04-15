package com.javachallengers.encapsulation.statickeyword;

public class StaticMethod {

    public static void main(String... staticAttributes) {
        StaticMethod.print();
    }

    static void print() {
        System.out.println("Static method, no instance required");
    }
}
