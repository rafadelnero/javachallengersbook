package com.javachallengers.encapsulation.instanceblocks;

public class StaticBlockPrint {

    static String name;

    static {
        name = "Challenger";
    }

    public static void main(String[] args) {
        System.out.println(StaticBlockPrint.name);
    }
}
