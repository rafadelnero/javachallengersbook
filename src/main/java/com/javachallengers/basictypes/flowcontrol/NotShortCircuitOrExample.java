package com.javachallengers.basictypes.flowcontrol;

public class NotShortCircuitOrExample {

    public static void main(String[] args) {
        int bartAge = 10;
        boolean isBartWithCinemaTicket = true;

        if (isBartWithCinemaTicket | bartAge++ >= 10) {
            System.out.println("Bart is " + bartAge + " old and can watch a movie");
        }

    }
}
