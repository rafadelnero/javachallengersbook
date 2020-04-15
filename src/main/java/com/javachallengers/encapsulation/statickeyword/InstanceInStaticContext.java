package com.javachallengers.encapsulation.statickeyword;

public class InstanceInStaticContext {

    String value;

    public static void main(String[] args) {
        InstanceInStaticContext instance = new InstanceInStaticContext();
        instance.value = "It's an instance";
        print(instance);
    }

    static void print(InstanceInStaticContext instance) {
        System.out.println(instance.value);
    }

}
