package com.codeclan.ShoppingProjectAPI.repositories;

import com.codeclan.ShoppingProjectAPI.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByName(String name);
}
