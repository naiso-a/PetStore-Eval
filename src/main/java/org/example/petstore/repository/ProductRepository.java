package org.example.petstore.repository;

import org.example.petstore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCode(String code);


}
