package com.javachallengers.basictypes.variablescoping;

public class BlockVariable {

    public static void main(String... starWars) {
        {
            int jediForce = 0; // This variable can only be used inside this block
        }

        // System.out.println(jediForce); jediForce can’t be used here
    }

}
