package com.javachallengers.chapter4.realworldchallenger.factory;

import com.javachallengers.chapter4.realworldchallenger.service.DiscountService;
import com.javachallengers.chapter4.realworldchallenger.service.NormalDiscountService;
import com.javachallengers.chapter4.realworldchallenger.service.VipDiscountService;

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
