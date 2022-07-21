package com.spring.shopspring.controllers;

import com.spring.shopspring.entites.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @GetMapping
    public ResponseEntity<Client> findAll(){
        Client u = new Client(null, "Marcos", "mgdn@gmail", "999999999", "password");
        return ResponseEntity.ok().body(u);
    }
}
