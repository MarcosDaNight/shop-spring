package com.spring.shopspring.repositories;

import com.spring.shopspring.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
