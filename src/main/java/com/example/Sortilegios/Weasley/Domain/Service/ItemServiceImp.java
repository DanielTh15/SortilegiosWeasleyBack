package com.example.Sortilegios.Weasley.Domain.Service;

import com.example.Sortilegios.Weasley.Domain.Dto.Item;
import com.example.Sortilegios.Weasley.Domain.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImp implements ItemService{
    private final ItemRepository itemRepository;
    @Autowired
    public ItemServiceImp(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.getAll();
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
