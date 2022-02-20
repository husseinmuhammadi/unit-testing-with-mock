package com.javastudio.tutorial.api;

import com.javastudio.tutorial.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<Product> findAll(String productName);
    List<Product> findAll(String productName, String productCategory);

    List<Product> findExpired(String productName);
}
