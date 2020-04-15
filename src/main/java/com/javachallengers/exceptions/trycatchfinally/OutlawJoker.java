package com.javachallengers.exceptions.trycatchfinally;

public class OutlawJoker {

    public static void main(String... avoidingFinallyExecution) {
        try {
            System.exit(0);
        } finally {
            System.out.println("Is the Joker getting caught?");
        }
    }

}
