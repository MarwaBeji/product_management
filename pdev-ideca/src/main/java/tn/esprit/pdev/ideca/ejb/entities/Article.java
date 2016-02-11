package tn.esprit.pdev.ideca.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Article
 *
 */
@Entity
@Table(name="t_article")

public class Article implements Serializable {

	@Id
	private Integer id_Article;
	private Date datePublication;
	private String text;
	private String title;
	private String autor;
	private static final long serialVersionUID = 1L;

	public Article() {
		super();
	}   
	public Integer getId_Article() {
		return this.id_Article;
	}

	public void setId_Article(Integer id_Article) {
		this.id_Article = id_Article;
	}   
	public Date getDatePublication() {
		return this.datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
   
}
