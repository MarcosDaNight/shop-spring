package com.spring.shopspring.config;

import com.spring.shopspring.entites.Client;
import com.spring.shopspring.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class InitialConfig  implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public void run(String... args) throws Exception {

        Client c0 = new Client(null, "Marcos Guillermo", "mgdn@gmail.com", "999999999", "123456");
        Client c1 = new Client(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Client c2 = new Client(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        clientRepository.saveAll(Arrays.asList(c0, c1,c2));
    }
}
