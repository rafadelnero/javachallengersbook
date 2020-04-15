package com.javachallengers.encapsulation.innerclass;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        new AnonymousInnerClass() {
            private void printSomethingElse() {
              System.out.println("Printing from the anonymous Inner class");
            }
        }.printSomethingElse();


    }

    private void print() {
        System.out.println("Print something");
    }
}
