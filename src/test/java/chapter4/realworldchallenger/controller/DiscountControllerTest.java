package chapter4.realworldchallenger.controller;

import chapter4.realworldchallenger.factory.DiscountFactory;
import chapter4.realworldchallenger.model.Product;
import chapter4.realworldchallenger.repository.ProductRepository;
import chapter4.realworldchallenger.service.NormalDiscountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class DiscountControllerTest {

    @Mock
    DiscountFactory discountFactory;

    @Mock
    ProductRepository productRepository;

    @Mock
    Logger log;

    @Test
    void applyDiscount() {
        NormalDiscountService normalDiscountService = new NormalDiscountService();
        Product product = new Product(1, "Bat Mobile", 1000);

        Mockito.when(discountFactory.getDiscountService("NORMAL_DISCOUNT"))
                .thenReturn(normalDiscountService);
        Mockito.when(normalDiscountService.applyDiscount(product.getPrice()))
                .thenReturn(product.getPrice());
        Mockito.when(productRepository.getProductById(1)).thenReturn(product);

        verify(log, times(1)).log(Level.INFO, "The product {} full price is {}, with discount is {}",
                new Object[]{product.getPrice(), 700D} );

        DiscountController testController = new DiscountController(discountFactory,
                productRepository, log);

        double result = testController.applyDiscount("NORMAL_DISCOUNT", 1);

        Assertions.assertEquals(result, 700D);
    }
}
