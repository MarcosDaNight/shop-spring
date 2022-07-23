package com.spring.shopspring.repositories;

import com.spring.shopspring.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
