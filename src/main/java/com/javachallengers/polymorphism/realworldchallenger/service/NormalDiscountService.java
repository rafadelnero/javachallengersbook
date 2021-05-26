package com.javachallengers.polymorphism.realworldchallenger.service;

public class NormalDiscountService extends DiscountService {

    private static final double DISCOUNT_RATE = 0.20;

    @Override
    public double applyDiscount(double productPrice) {
        return productPrice - (getNormalDiscount(productPrice) + super.getGeneralDiscount(productPrice));
    }

    private double getNormalDiscount(double productPrice) {
        return productPrice - (productPrice * DISCOUNT_RATE);
    }
}
