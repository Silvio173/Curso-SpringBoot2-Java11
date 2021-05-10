package com.sgmtec.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgmtec.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
