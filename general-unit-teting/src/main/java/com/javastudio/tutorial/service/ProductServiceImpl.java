package com.javastudio.tutorial.service;

import com.javastudio.tutorial.api.ProductService;
import com.javastudio.tutorial.dao.ProductDao;
import com.javastudio.tutorial.model.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> findAll(String productName) {
        return null;
    }

    @Override
    public List<Product> findAll(String productName, String productCategory) {
        return null;
    }

    @Override
    public List<Product> findExpired(String productName) {
        return productDao.findExpired(productName).stream()
                .filter(product -> product.getExpiryDate().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
    }
}
