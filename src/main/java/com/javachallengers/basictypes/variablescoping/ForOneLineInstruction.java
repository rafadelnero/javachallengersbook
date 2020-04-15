package com.javachallengers.basictypes.variablescoping;

public class ForOneLineInstruction {

    public static void main(String... starWars) {
        for (int i = 0; i <= 1; i++)
            System.out.println("The value of the i variable is: " + i);
        System.out.println("The variable ‘i’ is not accessible here");
    }

}
