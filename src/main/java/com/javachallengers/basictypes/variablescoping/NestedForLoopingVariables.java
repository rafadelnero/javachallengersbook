package com.javachallengers.basictypes.variablescoping;

public class NestedForLoopingVariables {

    public static void main(String... starWars) {
        for (int outerLooping = 0; outerLooping < 10; outerLooping++) {
            System.out.println(outerLooping);
            // System.out.println(innerLooping); innerLooping can’t be use here

            for (int innerLooping = 0; innerLooping < 10; innerLooping++) {
                System.out.println(innerLooping); // Both variables can be used here
                System.out.println(outerLooping);
            }

        }

        // System.out.println(innerLooping); this variable can’t be used here
        // System.out.println(outerLooping); this variable can’t be used here
    }

}
