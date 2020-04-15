package com.javachallengers.encapsulation.innerclass;

public class EnclosingLocalInnerClass {

    public static void main(String[] args) {
        // new CustomPrinter(); It's not possible
        // new LocalInnerClass().new CustomPrinter(); It's also not possible

        new EnclosingLocalInnerClass().print(); // That's the only way
    }

    void print () {
        class LocalInnerClass {
            void customPrint() {
                System.out.println("Customized print");
            }
        }

        new LocalInnerClass().customPrint(); // It's only possible to access the inner class here
    }
}
