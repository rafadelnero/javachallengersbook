package com.javachallengers.chapter4.realworldchallenger.controller;

import com.javachallengers.chapter4.realworldchallenger.factory.DiscountFactory;
import com.javachallengers.chapter4.realworldchallenger.model.Product;
import com.javachallengers.chapter4.realworldchallenger.repository.ProductRepository;
import com.javachallengers.chapter4.realworldchallenger.service.NormalDiscountService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.logging.Logger;

import static org.mockito.Mockito.*;

// TODO: Fix here
@RunWith(MockitoJUnitRunner.class)
public class DiscountControllerTest {

    @InjectMocks
    private DiscountController underTest;

    @Mock
    DiscountFactory discountFactory;

    @Mock
    NormalDiscountService normalDiscountService;

    @Mock
    ProductRepository productRepository;

    @Mock
    Logger log;

    public DiscountControllerTest() {
        MockitoAnnotations.initMocks(this);

        underTest = new DiscountController(discountFactory, productRepository, log);
    }

    @Test
    public void applyDiscount() {
        Product product = new Product(1, "Bat Mobile", 1000);

        Mockito.when(productRepository.getProductById(1)).thenReturn(product);
        doReturn(normalDiscountService).when(discountFactory).getDiscountService("NORMAL_DISCOUNT");
        doReturn(700.0).when(normalDiscountService).applyDiscount(product.getPrice());

        double result = underTest.applyDiscount("NORMAL_DISCOUNT", 1);

        Assert.assertEquals(result, 700D, 000.1);
    }
}
