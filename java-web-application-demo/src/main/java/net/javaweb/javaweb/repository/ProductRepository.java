package net.javaweb.javaweb.repository;

import net.javaweb.javaweb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer> {
    Product findByName(String name);
}
