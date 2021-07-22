package com.javachallengers.exceptions.challenges;

public class RyuShoryukenException {

    public static void main(String... doYourBest) {
        try {
            String ryu = null;
            ryu.contains("Shoryuken");
        } catch(Error error) {
            System.out.println("Akuma Secret Super Art");
        } finally {
            System.out.println("Shinkuu Hadouken");
        }

        System.out.println("Isshun Sengiku");
    }

}
