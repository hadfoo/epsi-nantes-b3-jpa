package fr.epsi.rennes.b3.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epsi.rennes.b3.jpa.entity.Article;

public interface ArticleRepository
extends JpaRepository<Article, Long> {
	
}
