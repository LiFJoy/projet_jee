package com.polytechnancy.reddit.resources;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class TopicDAO {
	
	@PersistenceContext(unitName = "RedditPU")
	private EntityManager em;
	
	public TopicDAO() {
		super();
	}
	
	public Topic findById(int id) {
		Topic topic = em.find(Topic.class,id);
		return topic;
		/*
		It's up to you
		*/

	}
	
	public List<Topic> findAll() {
		return em.createQuery( "SELECT t FROM Topic t", Topic.class).getResultList();
	}
	
	public void remove(int topicId) {
	    Topic topic = em.find(Topic.class, topicId);    
		if (topic != null) {
			em.remove(topic);      
		}
	}
	
	public void add(Topic topic) {
		em.persist(topic);
		/*
		It's up to you
		*/
	}
}