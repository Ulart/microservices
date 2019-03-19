package com.microservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Movie {
	
	@Id @GeneratedValue
	private int id;
	@Column(nullable=false, name="title")
	private String name;
	private String description;
	@Transient
	private int avgRating;
	@Transient
	private long numberOfVotes;
	
	
	
	public long getNumberOfVotes() {
		return numberOfVotes;
	}
	public void setNumberOfVotes(long numberOfVotes) {
		this.numberOfVotes = numberOfVotes;
	}
	public int getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Movie(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public Movie() {
		super();
	}
}
