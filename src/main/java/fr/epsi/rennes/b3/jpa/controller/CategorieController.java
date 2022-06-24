package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.epsi.rennes.b3.jpa.entity.Categorie;
import fr.epsi.rennes.b3.jpa.service.CategorieService;

@Controller
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;
	
	@GetMapping("/categorie/list")
	public String list(Model model) {
		model.addAttribute("categories", categorieService.getList());
		return "categorie-list";
	}
	
	@GetMapping("/categorie/add")
	public String ajouter() {
		return "categorie-add";
	}
	
	@PostMapping("/categorie/add")
	public String ajouter(Categorie categorie) {
		categorieService.ajouter(categorie);
		return "redirect:/";
	}

}
