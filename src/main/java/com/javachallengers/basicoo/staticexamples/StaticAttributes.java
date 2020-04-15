package com.javachallengers.basicoo.staticexamples;

public class StaticAttributes {

    static String staticEnergy;

    public static void main(String... staticAttributes) {
        staticEnergy = "Strong";
        StaticAttributes.staticEnergy = "Very Strong";

        System.out.println(staticEnergy);
    }
}
