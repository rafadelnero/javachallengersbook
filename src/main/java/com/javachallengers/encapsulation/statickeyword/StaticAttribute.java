package com.javachallengers.encapsulation.statickeyword;

public class StaticAttribute {

    static String staticEnergy;

    public static void main(String... staticAttributes) {
        StaticAttribute.staticEnergy = "Very Strong";
        System.out.println(staticEnergy);
    }
}
