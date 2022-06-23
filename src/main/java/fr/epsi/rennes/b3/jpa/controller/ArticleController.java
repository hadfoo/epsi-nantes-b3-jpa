package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.epsi.rennes.b3.jpa.entity.Article;
import fr.epsi.rennes.b3.jpa.repository.ArticleRepository;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@GetMapping("/article/add")
	public String add(Model model, @RequestParam Long fournisseur) {
		model.addAttribute("fournisseur", fournisseur);
		return "article-add";
	}
	
	@PostMapping("/article/add")
	public String add(Article article) {
		articleRepository.save(article);
		return String.format("redirect:/fournisseur/%s", article.getFournisseur().getId());
	}

}
