package com.extendedproj.coffeeShop;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extendedproj.coffeeShop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
