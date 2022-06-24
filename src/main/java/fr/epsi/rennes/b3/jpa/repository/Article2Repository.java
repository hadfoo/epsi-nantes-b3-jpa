package fr.epsi.rennes.b3.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epsi.rennes.b3.jpa.entity.Article2;

public interface Article2Repository
extends JpaRepository<Article2, Long> {
	
	List<Article2> findByCategoriesCode(String code);

}
