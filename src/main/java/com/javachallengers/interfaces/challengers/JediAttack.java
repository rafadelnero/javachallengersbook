package com.javachallengers.interfaces.challengers;

public class JediAttack {

        interface Jedi {
            default int attack() {
                return jump() + useSaber() + useForce();
            }
            private int useForce() { return 5; }
            private static int useSaber() { return 3; }
            private int jump() { return 1; }
        }

        public static void main(String... doYourBest) {
            System.out.println(new Jedi() {
                public int jump() {
                    return 2;
                }}.attack() + Jedi.useSaber());
        }

}
