package com.spring.shopspring.services.order;

import com.spring.shopspring.entites.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order findById(Long id);
}
