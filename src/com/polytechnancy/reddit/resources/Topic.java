package com.polytechnancy.reddit.resources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topics")

public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "topic_name")
	private String topicName;
	@Column(name = "context")
	private String context;
	
	
	public Topic(String topicName) {
		super();
		this.topicName = topicName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTopicName() {
		return topicName;
	}


	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}


	public String getContext() {
		return context;
	}


	public void setContext(String context) {
		this.context = context;
	}
	
	
}
