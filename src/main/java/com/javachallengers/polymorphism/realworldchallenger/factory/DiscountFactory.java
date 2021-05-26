package com.javachallengers.polymorphism.realworldchallenger.factory;

import com.javachallengers.polymorphism.realworldchallenger.service.DiscountService;
import com.javachallengers.polymorphism.realworldchallenger.service.NormalDiscountService;
import com.javachallengers.polymorphism.realworldchallenger.service.VipDiscountService;

public class DiscountFactory {

    private static final String NORMAL_DISCOUNT = "NORMAL_DISCOUNT";
    private static final String VIP_DISCOUNT = "VIP_DISCOUNT";

    public DiscountService getDiscountService(final String command) {
        return switch (command) {
            case NORMAL_DISCOUNT -> new NormalDiscountService();
            case VIP_DISCOUNT -> new VipDiscountService();
            default -> throw new IllegalArgumentException("The Discount is not existent");
        };
    }

}
