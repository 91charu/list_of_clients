package com.example.clients.repositories;

import com.example.clients.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    public  Client findByEmail(String email);
}
