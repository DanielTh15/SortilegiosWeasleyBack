package com.example.Sortilegios.Weasley.Persistence.RepositoryImp;

import com.example.Sortilegios.Weasley.Domain.Dto.Category;
import com.example.Sortilegios.Weasley.Domain.Repository.CategoryRepository;
import com.example.Sortilegios.Weasley.Persistence.Crud.CategoriaCrud;
import com.example.Sortilegios.Weasley.Persistence.Entity.Categoria;
import com.example.Sortilegios.Weasley.Persistence.Mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CategoryRepositoryImp implements CategoryRepository {

    private final CategoriaCrud categoriaCrud;
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryRepositoryImp(CategoriaCrud categoriaCrud, CategoryMapper categoryMapper) {
        this.categoriaCrud = categoriaCrud;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<Category> getAll() {
        List<Categoria> categorias = categoriaCrud.findAll();
        return categoryMapper.toCategories(categorias);
    }
}
