package com.javachallengers.encapsulation.innerclass;

public class EnclosingStaticInnerClass {

    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new EnclosingStaticInnerClass.StaticInnerClass();
        staticInnerClass.print();
    }

    static class StaticInnerClass {
        private void print() {
            System.out.println("Static inner class");
        }
    }
}
