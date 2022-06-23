package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.epsi.rennes.b3.jpa.entity.Client;
import fr.epsi.rennes.b3.jpa.repository.ClientRepository;

@Controller
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/client/list")
	public String list(Model model) {
		model.addAttribute("clients", clientRepository.findAll());
		return "client-list";
	}
	
	@GetMapping("/client/add")
	public String add() {
		return "client-add";
	}
	
	@PostMapping("/client/add")
	public String add(Client client) {
		clientRepository.save(client);
		return "redirect:/client/list";
	}

}
