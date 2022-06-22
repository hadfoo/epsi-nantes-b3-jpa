package fr.epsi.rennes.b3.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	
	@PersistenceContext
	private EntityManager em;

}
