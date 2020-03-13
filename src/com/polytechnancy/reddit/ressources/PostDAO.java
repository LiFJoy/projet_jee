package com.polytechnancy.reddit.ressources;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PostDAO {
	@PersistenceContext(unitName = "RedditPU")
	private EntityManager em;
	
	public Post findById(int id) {
		Post post = em.find(Post.class, id);  
		return post;
	}
	
	public List<Post> findAll() {
		return em.createQuery( "SELECT t FROM Post t", Post.class).getResultList();
	}
	
	public void remove(int taskId) {
	    Post post = em.find(Post.class, taskId);    
		if (post != null) {
			em.remove(post);      
		}
	}
	
	public void add(Post post) {
		em.persist(post);
	}

}
