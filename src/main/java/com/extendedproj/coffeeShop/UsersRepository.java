package com.extendedproj.coffeeShop;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extendedproj.coffeeShop.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
