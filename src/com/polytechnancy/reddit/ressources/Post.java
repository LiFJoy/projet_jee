package com.polytechnancy.reddit.ressources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "titre")
	private String titre;
	
	@Column(name = "content")
	private String content;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(String titre) {
		super();
		this.titre = titre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	
	
}
	