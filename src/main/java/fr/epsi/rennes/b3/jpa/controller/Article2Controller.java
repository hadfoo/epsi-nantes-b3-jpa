package fr.epsi.rennes.b3.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.epsi.rennes.b3.jpa.entity.Article2;
import fr.epsi.rennes.b3.jpa.entity.Article2Categorie2;
import fr.epsi.rennes.b3.jpa.repository.Article2Repository;
import fr.epsi.rennes.b3.jpa.repository.Categorie2Repository;

@Controller
public class Article2Controller {
	
	@Autowired
	private Article2Repository article2Repository;
	
	@Autowired
	private Categorie2Repository categorie2Repository;
	
	@PersistenceContext
	private EntityManager em;
	
	@GetMapping("/article2/add")
	public String ajouter() {
		return "article2-add";
	}
	
	@PostMapping("/article2/add")
	public String ajouter(Article2 article) {
		article2Repository.save(article);
		return String.format(
				"redirect:/article2/categorie2?article=%s",
				article.getId());
	}
	
	@GetMapping("/article2/categorie2")
	public String categorie(Model model, @RequestParam Long article) {
		model.addAttribute("article", article);
		model.addAttribute("categories", categorie2Repository.findAll());
		return "article2-categorie2";
	}
	
	@PostMapping("/article2/categorie2")
	@Transactional
	public String categorie(Article2Categorie2 association) {
		em.persist(association);
		return "redirect:/article2/list";
	}
	
	@GetMapping("/article2/list")
	public String list(
			Model model,
			@RequestParam(required = false) String categorie) {
		
		if (categorie == null) {
			model.addAttribute("articles", article2Repository.findAll());
		} else {
			model.addAttribute("articles", article2Repository.findByCategoriesCode(categorie));
		}
		return "article2-list";
	}

}
