package com.spring.shopspring.repositories;

import com.spring.shopspring.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
