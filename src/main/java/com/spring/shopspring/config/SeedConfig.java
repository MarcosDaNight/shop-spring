package com.spring.shopspring.config;

import com.spring.shopspring.entites.Category;
import com.spring.shopspring.entites.Client;
import com.spring.shopspring.entites.Order;
import com.spring.shopspring.entites.Product;
import com.spring.shopspring.entites.enums.OrderStatus;
import com.spring.shopspring.repositories.CategoryRepository;
import com.spring.shopspring.repositories.ClientRepository;
import com.spring.shopspring.repositories.OrderRepository;
import com.spring.shopspring.repositories.ProductRepository;
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

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(p1, p2, p3,p4, p5));

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
