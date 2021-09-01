package com.api.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.empresa.model.Client;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("api/clients")
	public List<Client> getClients(){
		return clientService.getAllClients();
	}
	
	@PostMapping("api/clients")
	public Client saveClient(@RequestBody Client client) {
		System.out.println(client);
		clientService.save(client);
		return client;
	}
	
}
