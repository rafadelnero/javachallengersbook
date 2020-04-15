package com.javachallengers.encapsulation.statickeyword;

public class StaticAccessToThis {

    private String name;

    public static void main(String[] args) {
        print();
    }

    static void print() {
        // We can't access the current instance in a static context
        // System.out.println(this.name);
    }
}
