package com.example.Sortilegios.Weasley.Persistence.Mapper;

import com.example.Sortilegios.Weasley.Domain.Dto.Category;
import com.example.Sortilegios.Weasley.Persistence.Entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "idCategory"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "articulos", target = "items")
    })
    Category toCategory(Categoria categoria);
    List<Category> toCategories(List<Categoria> categorias);
    @InheritInverseConfiguration
    Categoria toCategoria(Category category);

}
