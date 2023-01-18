package com.alexjunior.projectspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexjunior.projectspringbootjpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
