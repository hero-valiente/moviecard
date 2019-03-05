package com.hero.moviecard.model;

import java.time.Year;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Descriptions")
public class Description {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String synopsis;
	private Year premiere;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public Year getPremiere() {
		return premiere;
	}
	public void setPremiere(Year premiere) {
		this.premiere = premiere;
	}
}
