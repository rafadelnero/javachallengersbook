package com.javachallengers.encapsulation.telldontask;

public class Customer {

    private static final double MINIMUM_AMOUNT_TO_GET_DISCOUNT = 2000;

    // Other attibutes
    private double totalAmountSpent;

    // Getters and setters

    public boolean isElegibleForDiscount() {
        return totalAmountSpent >= MINIMUM_AMOUNT_TO_GET_DISCOUNT;
    }

}
