package com.javachallengers.basicoo.thiskeyword;

public class InvokingMethod {

    public static void main(String[] args) {
        InvokingMethod invokingMethod = new InvokingMethod();
        invokingMethod.accelerate();
    }

    void turnLeft() {
        System.out.println("Turn left");
    }

    void accelerate() {
        System.out.println("Acelerate");
        this.turnLeft();
    }
}
