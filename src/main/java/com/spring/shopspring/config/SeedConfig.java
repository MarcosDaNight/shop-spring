package com.spring.shopspring.config;

import com.spring.shopspring.entites.Category;
import com.spring.shopspring.entites.Client;
import com.spring.shopspring.entites.Order;
import com.spring.shopspring.entites.enums.OrderStatus;
import com.spring.shopspring.repositories.CategoryRepository;
import com.spring.shopspring.repositories.ClientRepository;
import com.spring.shopspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class SeedConfig implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Client c0 = new Client(null, "Marcos Guillermo", "mgdn@gmail.com", "999999999", "123456");
        Client c1 = new Client(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Client c2 = new Client(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        clientRepository.saveAll(Arrays.asList(c0, c1,c2));

        Order o1 = new Order(null, Instant.parse("2022-06-20T19:53:07Z"), OrderStatus.PAID, c1);
        Order o2 = new Order(null, Instant.parse("2021-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, c0);
        Order o3 = new Order(null, Instant.parse("2021-07-22T15:21:22Z"),OrderStatus.DELIVERED, c2);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
