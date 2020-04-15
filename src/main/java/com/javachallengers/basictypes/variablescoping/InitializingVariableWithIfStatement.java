package com.javachallengers.basictypes.variablescoping;

public class InitializingVariableWithIfStatement {

    public static void main(String[] args) {
        int beerCount;
        boolean test = true;


        if (test) {
            beerCount = 0;
        }

        // System.out.println(beerCount); It won't compile because the JVM doesn't know for sure if the variable
        // was initialized
    }
}
