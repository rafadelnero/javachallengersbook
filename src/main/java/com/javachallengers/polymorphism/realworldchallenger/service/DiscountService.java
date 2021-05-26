package com.javachallengers.polymorphism.realworldchallenger.service;

public abstract class DiscountService {

    public abstract double applyDiscount(double productPrice);

    double getGeneralDiscount(double productPrice) {
        double generalDiscountRate = 0.10;
        return productPrice + (productPrice * generalDiscountRate);
    }

}
