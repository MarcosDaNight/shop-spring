package com.spring.shopspring.services.category;

import com.spring.shopspring.entites.Category;
import com.spring.shopspring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        Optional<Category> categoryOp = this.categoryRepository.findById(id);
        return categoryOp.get();
    }
}
