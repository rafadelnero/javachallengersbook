package com.javachallengers.overloading.challengers;

public class KeyMakerOverloading {

    public static void main(String... primitiveOverloading) {
        makeKey(1);
        makeKey(1F);
        makeKey('1');
        makeKey(1.0);
    }

    static void makeKey(short shortCode) { System.out.println("short:" + shortCode); }
    static void makeKey(long longCode) { System.out.println("long:" + longCode); }
    static void makeKey(float floatCode) { System.out.println("float:" + floatCode); }
    static void makeKey(double floatCode) { System.out.println("double:" + floatCode); }

}
