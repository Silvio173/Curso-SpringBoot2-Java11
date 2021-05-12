package com.sgmtec.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgmtec.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
