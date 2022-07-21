package com.spring.shopspring.services.client;

import com.spring.shopspring.entites.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order findById(Long id);
}
