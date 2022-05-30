package com.codeclan.ShoppingProjectAPI.controllers;

import com.codeclan.ShoppingProjectAPI.models.Item;
import com.codeclan.ShoppingProjectAPI.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping(value = "/items")
    public ResponseEntity<List<Item>> getAllItems(
    ){
        return new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/items/{id}")
    public ResponseEntity getItem(@PathVariable Long id){
        return new ResponseEntity<>(itemRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/it/{name}")
    public ResponseEntity getItemByName(@PathVariable String name){
        return new ResponseEntity<>(itemRepository.findByName(name), HttpStatus.OK);
    }
}
