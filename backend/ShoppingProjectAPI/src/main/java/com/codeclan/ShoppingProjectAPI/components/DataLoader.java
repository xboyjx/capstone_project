package com.codeclan.ShoppingProjectAPI.components;

import com.codeclan.ShoppingProjectAPI.models.Item;
import com.codeclan.ShoppingProjectAPI.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ItemRepository itemRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        Item milk = new Item("milk", 1.10);
        itemRepository.save(milk);

        Item warburtonsWhiteBread = new Item("Warburtons white bread", 0.96);
        itemRepository.save(warburtonsWhiteBread);
    }
}
