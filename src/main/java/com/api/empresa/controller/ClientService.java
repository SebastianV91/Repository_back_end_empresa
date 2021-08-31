package com.api.empresa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.empresa.model.Client;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	public List<Client> getAllClients(){
		return clientRepository.findAll();
	}
	
	
	
}
