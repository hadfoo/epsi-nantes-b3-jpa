package fr.epsi.rennes.b3.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.epsi.rennes.b3.jpa.entity.Categorie;

@Service
public class CategorieService {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<Categorie> getList() {
		String query = "select c from Categorie c";
		return em.createQuery(query, Categorie.class).getResultList();
	}
	
	@Transactional
	public void ajouter(Categorie categorie) {
		em.persist(categorie);
	}

}
