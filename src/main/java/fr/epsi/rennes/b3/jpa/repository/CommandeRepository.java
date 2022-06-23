package fr.epsi.rennes.b3.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epsi.rennes.b3.jpa.entity.Commande;

public interface CommandeRepository
extends JpaRepository<Commande, Long> {
	
	List<Commande> findByItemsArticleFournisseurId(Long id);
	List<Commande> findByClientEmail(String email);

}
