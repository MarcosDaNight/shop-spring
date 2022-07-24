package com.spring.shopspring.services.product;

import com.spring.shopspring.entites.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);
}
