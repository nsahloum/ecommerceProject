package com.fullstack.ecommerceproject.dao;

import com.fullstack.ecommerceproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200/")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
