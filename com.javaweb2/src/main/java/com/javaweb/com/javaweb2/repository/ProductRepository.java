package com.javaweb.com.javaweb2.repository;

import com.javaweb.com.javaweb2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer> {
    Product findByName(String name);
}
