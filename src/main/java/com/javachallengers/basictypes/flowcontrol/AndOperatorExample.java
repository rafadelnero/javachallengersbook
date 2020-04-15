package com.javachallengers.basictypes.flowcontrol;

public class AndOperatorExample {

    public static void main(String[] args) {
        int bartAge = 10;
        double bartMoney = 20;
        if (bartAge > 18 && bartMoney++ >= 10) {
            System.out.println("Bart can go to the cinema");
        }

    }
}
