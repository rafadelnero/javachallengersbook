package com.javachallengers.encapsulation.innerclass;

public class EnclosingInstanceInnerClass {

    public static void main(String[] args) {
        EnclosingInstanceInnerClass enclosingInstanceInnerClass = new EnclosingInstanceInnerClass();
        enclosingInstanceInnerClass.new InstanceInnerClass().print();
    }

    private void print() {
        System.out.println("Text from the enclosing class");
    }

    class InstanceInnerClass {

        public void print() {
            new EnclosingInstanceInnerClass().print();
        }

    }

}
