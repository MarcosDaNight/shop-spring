package com.spring.shopspring.controllers;

import com.spring.shopspring.entites.Order;
import com.spring.shopspring.services.client.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok().body(this.orderService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order =this.orderService.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
