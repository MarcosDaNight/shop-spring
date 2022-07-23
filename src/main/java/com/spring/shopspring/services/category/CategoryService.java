package com.spring.shopspring.services.category;

import com.spring.shopspring.entites.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Long id);
}
