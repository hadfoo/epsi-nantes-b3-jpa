package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.epsi.rennes.b3.jpa.entity.Fournisseur;
import fr.epsi.rennes.b3.jpa.repository.FournisseurRepository;

@Controller
public class FournisseurController {
	
	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	@GetMapping("/fournisseur/list")
	public String list(Model model) {
		model.addAttribute("fournisseurs", fournisseurRepository.findAll());
		return "fournisseur-list";
	}
	
	@GetMapping("/fournisseur/add")
	public String add(Model model) {
		return "fournisseur-add";
	}
	
	@PostMapping("/fournisseur/add")
	public String add(Fournisseur fournisseur) {
		fournisseurRepository.save(fournisseur);
		return "redirect:/fournisseur/list";
	}
	
	@GetMapping("/fournisseur/{id}")
	public String detail(Model model, @PathVariable Long id) {
		model.addAttribute("fournisseur", fournisseurRepository.getById(id));
		return "fournisseur-detail";
	}

}
