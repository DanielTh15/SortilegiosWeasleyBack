package com.example.Sortilegios.Weasley.Web.Controller;

import com.example.Sortilegios.Weasley.Domain.Dto.Item;
import com.example.Sortilegios.Weasley.Domain.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Item>> getAll(){
        return ResponseEntity.ok(itemService.getAll());
    }
    @PostMapping("/save")
    public ResponseEntity<Item> save(@RequestBody Item item){
        return new ResponseEntity<>(itemService.save(item), HttpStatus.CREATED);
    }

}
