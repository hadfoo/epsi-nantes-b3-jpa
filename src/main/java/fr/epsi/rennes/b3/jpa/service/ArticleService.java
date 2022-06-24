package fr.epsi.rennes.b3.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.epsi.rennes.b3.jpa.entity.Article;

@Service
public class ArticleService {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void ajouter(Article article) {
		em.persist(article);
	}
	
	@Transactional
	public List<Article> getList() {
		String jpql = "select a from Article a";
		return em.createQuery(jpql, Article.class).getResultList();
	}

}
