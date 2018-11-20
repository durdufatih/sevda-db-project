package com.database.webproject;

import com.database.webproject.model.Item;
import com.database.webproject.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;


public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/items")
    public Iterable<Item> getAllItems(){
        return itemRepository.findAll();
    }

    @PostMapping("/items")
    public Item saveItem(@Valid @RequestBody Item item){
        return itemRepository.save(item);
    }

}
