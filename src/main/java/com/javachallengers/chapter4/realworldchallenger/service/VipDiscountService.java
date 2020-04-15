package com.javachallengers.chapter4.realworldchallenger.service;

public class VipDiscountService extends DiscountService {
    private static final double DISCOUNT_RATE = 0.50;

    @Override
    public double applyDiscount(double productPrice) {
        return productPrice - (getPriceWithVipDiscount(productPrice)
                + super.getGeneralDiscount(productPrice));
    }

    private double getPriceWithVipDiscount(double productPrice) {
        return productPrice - (productPrice * DISCOUNT_RATE);
    }
}
