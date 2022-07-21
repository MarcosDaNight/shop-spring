package com.spring.shopspring.repositories;

import com.spring.shopspring.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
