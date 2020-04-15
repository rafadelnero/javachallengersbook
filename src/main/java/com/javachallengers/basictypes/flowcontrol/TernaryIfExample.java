package com.javachallengers.basictypes.flowcontrol;

public class TernaryIfExample {

    public static void main(String[] args) {
        int beerQuantity = 50;
        String beersOwner = beerQuantity >= 50 ? "Homer" : "Moe";
        System.out.println(beersOwner);
    }
}
