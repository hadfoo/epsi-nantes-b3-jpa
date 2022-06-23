package fr.epsi.rennes.b3.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.epsi.rennes.b3.jpa.entity.Commande;
import fr.epsi.rennes.b3.jpa.entity.CommandeItem;
import fr.epsi.rennes.b3.jpa.repository.ArticleRepository;
import fr.epsi.rennes.b3.jpa.repository.ClientRepository;
import fr.epsi.rennes.b3.jpa.repository.CommandeItemRepository;
import fr.epsi.rennes.b3.jpa.repository.CommandeRepository;
import fr.epsi.rennes.b3.jpa.repository.FournisseurRepository;

@Controller
public class CommandeController {
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	@Autowired
	private CommandeItemRepository commandeItemRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@GetMapping("/commande/list")
	public String list(
			Model model,
			@RequestParam(required = false) String client,
			@RequestParam(required = false) Long fournisseur) {
		
		model.addAttribute("clients", clientRepository.findAll());
		model.addAttribute("fournisseurs", fournisseurRepository.findAll());
		
		if (client != null) {
			model.addAttribute("commandes", commandeRepository.findByClientEmail(client));
		} else if (fournisseur != null) {
			model.addAttribute("commandes", commandeRepository.findByItemsArticleFournisseurId(fournisseur));
		} else {
			model.addAttribute("commandes", commandeRepository.findAll());
		}
		return "commande-list";
	}
	
	@GetMapping("/commande/init")
	public String init(Model model) {
		model.addAttribute("clients", clientRepository.findAll());
		return "commande-init";
	}
	
	@PostMapping("/commande/init")
	public String init(Commande commande) {
		commandeRepository.save(commande);
		return String.format("redirect:/commande/%s", commande.getId());
	}
	
	@GetMapping("/commande/{id}")
	public String detail(Model model, @PathVariable Long id) {
		model.addAttribute("articles", articleRepository.findAll());
		model.addAttribute("commande", commandeRepository.getById(id));
		return "commande-detail";
	}
	
	@PostMapping("/commande/detail")
	public String detail(CommandeItem item) {
		commandeItemRepository.save(item);
		return String.format("redirect:/commande/%s", item.getCommande().getId());
	}
	
}
