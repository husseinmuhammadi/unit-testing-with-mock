package com.javastudio.tutorial.api;

import com.javastudio.tutorial.dao.ProductDao;
import com.javastudio.tutorial.model.Product;
import com.javastudio.tutorial.service.ProductServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {


    ProductDao productDao;
    ProductService productService;

    @Before
    public void setUp() {
        productDao = Mockito.mock(ProductDao.class);

        List<Product> products = new ArrayList<>();
        products.add(new Product("apple type #1", LocalDate.now()));
        products.add(new Product("apple type #2", LocalDate.now().plusDays(1)));
        products.add(new Product("apple type #3", LocalDate.now().minusDays(1)));
        products.add(new Product("apple type #4", LocalDate.now().minusDays(2)));

        Mockito.when(productDao.findExpired("apple")).thenReturn(products);

        productService = new ProductServiceImpl(productDao);
    }

    @Test
    public void shouldReturnListOfProducts() {
        Assert.assertNotNull(productService.findAll());
    }

    @Test
    public void whenFindAllProducts_shouldReturnListOfProducts() {
        Assert.assertNotNull(productService.findAll());
    }

    @Test
    public void givenProductService_whenFindAll_thenResultShouldNotEmpty() {

    }

    @Test
    public void whenSearchForExpiredProducts_thenExpiryDateShouldPast() {
        List<Product> actual = productService.findExpired("apple");
        Assert.assertNotNull(actual);
        Assert.assertEquals(2, actual.size());
        Mockito.verify(productDao).findExpired("apple");
    }
}