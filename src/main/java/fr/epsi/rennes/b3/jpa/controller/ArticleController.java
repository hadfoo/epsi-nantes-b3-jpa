package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.epsi.rennes.b3.jpa.entity.Article;
import fr.epsi.rennes.b3.jpa.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/article/{code}")
	public String articles(Model model, @PathVariable String code) {
		return "article-details";
	}
	
	@GetMapping("/article/add")
	public String add(Model model) {
		return "article-add";
	}
	
	@PostMapping("/article/add")
	public String add(Article article) {
		return "redirect:/";
	}

}
