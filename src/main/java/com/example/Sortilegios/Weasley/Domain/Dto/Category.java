package com.example.Sortilegios.Weasley.Domain.Dto;

import com.example.Sortilegios.Weasley.Persistence.Entity.Articulo;

import java.util.List;

public class Category {

    private Integer idCategory;
    private String name;
    private String description;
    private List<Item> Items;

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }
}
