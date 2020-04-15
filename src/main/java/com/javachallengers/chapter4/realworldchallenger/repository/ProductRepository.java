package com.javachallengers.chapter4.realworldchallenger.repository;


import com.javachallengers.chapter4.realworldchallenger.model.Product;

import java.util.List;

public class ProductRepository {

    public Product getProductById(int productId) {
        return getProducts().get(productId);
    }

    private List<Product> getProducts() {
        return List.of(new Product(1, "Bat Mobile", 1000),
                new Product(2, "Flying Car", 2000),
                new Product(3, "PS10", 500),
                new Product(4, "Jetpack", 800),
                new Product(4, "Ultima Weapon Sword", 700),
                new Product(5, "Duff Beer", 10));
    }
}
