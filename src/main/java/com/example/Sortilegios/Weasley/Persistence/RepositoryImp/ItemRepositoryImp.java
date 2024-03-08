package com.example.Sortilegios.Weasley.Persistence.RepositoryImp;

import com.example.Sortilegios.Weasley.Domain.Dto.Item;
import com.example.Sortilegios.Weasley.Domain.Repository.ItemRepository;
import com.example.Sortilegios.Weasley.Persistence.Crud.ArticuloCrud;
import com.example.Sortilegios.Weasley.Persistence.Entity.Articulo;
import com.example.Sortilegios.Weasley.Persistence.Mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ItemRepositoryImp implements ItemRepository {

    private final ArticuloCrud articuloCrud;
    private final ItemMapper itemMapper;

    @Autowired
    public ItemRepositoryImp(ArticuloCrud articuloCrud, ItemMapper itemMapper) {
        this.articuloCrud = articuloCrud;
        this.itemMapper = itemMapper;
    }

    @Override
    public List<Item> getAll() {
        List<Articulo> articulos = articuloCrud.findAll();
        return itemMapper.toItem(articulos);
    }

    @Override
    public Item save(Item item) {
    Articulo articulo = itemMapper.toArticulo(item);
        return itemMapper.toItem(articuloCrud.save(articulo));
    }
}
