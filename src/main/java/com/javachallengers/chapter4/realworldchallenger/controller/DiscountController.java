package com.javachallengers.chapter4.realworldchallenger.controller;

import com.javachallengers.chapter4.realworldchallenger.factory.DiscountFactory;
import com.javachallengers.chapter4.realworldchallenger.model.Product;
import com.javachallengers.chapter4.realworldchallenger.repository.ProductRepository;
import com.javachallengers.chapter4.realworldchallenger.service.DiscountService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DiscountController {

    private Logger logger;

    private ProductRepository productRepository;
    private DiscountFactory discountFactory;

    public DiscountController(DiscountFactory discountFactory, ProductRepository productRepository,
                              Logger logger) {
        this.discountFactory = discountFactory;
        this.productRepository = productRepository;
        this.logger = logger;
    }

    public double applyDiscount(String command, int productId) {
        Product product = productRepository.getProductById(productId);

        DiscountService discountService = discountFactory.getDiscountService(command);
        double finalPrice = discountService.applyDiscount(product.getPrice());

        logger.log(Level.INFO, "The product {} full price is {}, with discount is {}",
                new Object[]{product.getName(), product.getPrice(), finalPrice} );

        return finalPrice;
    }

}
