package com.example.Sortilegios.Weasley.Domain.Service;

import com.example.Sortilegios.Weasley.Domain.Dto.Category;
import com.example.Sortilegios.Weasley.Domain.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService{
    private  final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
}
