package com.api.empresa.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.empresa.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
