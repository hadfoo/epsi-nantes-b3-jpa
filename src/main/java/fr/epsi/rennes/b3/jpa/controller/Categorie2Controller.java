package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.epsi.rennes.b3.jpa.entity.Categorie2;
import fr.epsi.rennes.b3.jpa.repository.Categorie2Repository;

@Controller
public class Categorie2Controller {
	
	@Autowired
	private Categorie2Repository categorie2Repository;
	
	@GetMapping("/categorie2/add")
	public String ajouter() {
		return "categorie2-add";
	}
	
	@PostMapping("/categorie2/add")
	public String ajouter(Categorie2 categorie) {
		categorie2Repository.save(categorie);
		return "redirect:/";
	}

}
