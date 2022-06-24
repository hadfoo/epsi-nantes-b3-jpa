package fr.epsi.rennes.b3.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article_categorie_association")
public class Article2Categorie2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article2 article;
	
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie2 categorie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Article2 getArticle() {
		return article;
	}

	public void setArticle(Article2 article) {
		this.article = article;
	}

	public Categorie2 getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie2 categorie) {
		this.categorie = categorie;
	}

}
