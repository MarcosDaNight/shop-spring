package com.spring.shopspring.services.order;

import com.spring.shopspring.entites.Order;
import com.spring.shopspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {

        Optional<Order> orderOp = this.orderRepository.findById(id);
        return orderOp.get();
    }
}
