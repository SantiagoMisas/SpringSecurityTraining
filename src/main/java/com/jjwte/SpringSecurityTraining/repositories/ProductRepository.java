package com.jjwte.SpringSecurityTraining.repositories;

import com.jjwte.SpringSecurityTraining.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
