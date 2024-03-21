package org.example.laborm.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.laborm.dao.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
