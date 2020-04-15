package com.javachallengers.chapter4.defaultconstructor;

public class DefaultConstructorInheritance {
    static class Villain {
        Villain() {
            System.out.println("A villain was created!");
        }

        public static void main(String ...defaultSuperConstructorInvocation) {
            new Magneto();
        }
    }

    static class Magneto extends Villain {
        // The JVM will create the default constructor invoking the parent class constructor

        /* This is the default constructor:
           public Magneto() { super(); } */
    }
}
