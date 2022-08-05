package com.spring.shopspring.services.client;

import com.spring.shopspring.entites.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();

    Client findById(Long id);

    Client insertClient(Client client);
}
