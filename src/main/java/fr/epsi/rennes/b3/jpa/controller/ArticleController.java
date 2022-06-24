package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.epsi.rennes.b3.jpa.entity.Article;
import fr.epsi.rennes.b3.jpa.service.ArticleService;
import fr.epsi.rennes.b3.jpa.service.CategorieService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private CategorieService categorieService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("articles", articleService.getList());
		return "home";
	}
	
	@GetMapping("/article/{code}")
	public String articles(Model model, @PathVariable String code) {
		return "article-details";
	}
	
	@GetMapping("/article/add")
	public String add(Model model) {
		model.addAttribute("categories", categorieService.getList());
		return "article-add";
	}
	
	@PostMapping("/article/add")
	public String add(Article article) {
		articleService.ajouter(article);
		return "redirect:/";
	}

}
