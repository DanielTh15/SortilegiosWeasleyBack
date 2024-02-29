package com.example.Sortilegios.Weasley.Persistence.RepositoryImp;

import com.example.Sortilegios.Weasley.Domain.Dto.Item;
import com.example.Sortilegios.Weasley.Domain.Repository.ItemRepository;
import com.example.Sortilegios.Weasley.Persistence.Crud.ArticuloCrud;
import com.example.Sortilegios.Weasley.Persistence.Mapper.ItemMapper;

import java.util.List;

public class ItemRepositoryImp implements ItemRepository {

    private final ArticuloCrud articuloCrud;
    private final ItemMapper itemMapper;

    public ItemRepositoryImp(ArticuloCrud articuloCrud, ItemMapper itemMapper) {
        this.articuloCrud = articuloCrud;
        this.itemMapper = itemMapper;
    }

    @Override
    public List<Item> getAll() {
        return null;
    }
}
